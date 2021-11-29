package Entities;

import AbstrClasses.SceneObject;
import Enums.*;
import Interfaces.iCarlson;
import Things.*;

import static Enums.CarlsonStatus.*;

public class Carlson extends SceneObject implements iCarlson {

    public CarlsonStatus condition = NORMAL;


    public void setCondition(CarlsonStatus condition) {
        this.condition = condition;
    }

    public CarlsonStatus getCondition() { return this.condition; }

    public void flyAround(Motor motor, Carlson carlson) {
        if (motor.checkMotor(motor)) {
            carlson.setCondition(CarlsonStatus.FLYING);
            System.out.print(this.name + " " + this.condition.label + "\n");
        }
        else {
            System.out.println("Карлсон не может взлететь с выключенным моторчиком!");
            System.exit(1);
        }
    }

    public void stopFlying(Motor motor, Carlson carlson) {
        if (!(motor == null) && !(carlson == null) && motor.checkMotor(motor)) {
            carlson.setCondition(CarlsonStatus.NORMAL);
            motor.condition = MotorStatus.TURNED_OFF;
            System.out.println(this.name + " " + this.condition.label + "\n");
        }
        else {
            System.out.println("Карлсон и так никуда не взлетал :(");
            System.exit(1);
        }
    }

    public void beScary(Carlson carlson, Child child) {
        if (!(carlson == null) && carlson.getCondition().equals(FLYING)
            && carlson.getCondition().equals(WRAPPED)) {
            child.startConsternation();
        }
        else child.stopConsternation();
    }

    public Carlson(String name) {
        super(name);
        System.out.println("Карлсон таинственным образом оказался в комнате.");
    }
}
