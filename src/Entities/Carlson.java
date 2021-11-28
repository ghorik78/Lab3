package Entities;

import AbstrClasses.SceneObject;
import Enums.*;
import Things.*;

public class Carlson extends SceneObject {

    private CarlsonStatus condition = CarlsonStatus.NORMAL;

    private void setCondition(CarlsonStatus condition) {
        this.condition = condition;
    }

    public void flyAround(Motor motor, Carlson carlson, Chandelier chandelier) {
        if (motor.getCondition().equals(MotorStatus.TURNED_ON)) {
            carlson.setCondition(CarlsonStatus.FLYING);
            System.out.print(this.name + " " + this.condition.label + "\n");
        }
        else {
            System.out.println("Карлсон не может взлететь с выключенным моторчиком!");
            System.exit(1);
        }
    }

    public void stopFlying(Motor motor, Carlson carlson) {
        if (!(motor == null) && !(carlson == null) && motor.getCondition().equals(MotorStatus.TURNED_ON)) {
            this.setCondition(CarlsonStatus.NORMAL);
            motor.setCondition(MotorStatus.TURNED_OFF);
            System.out.println(this.name + " " + this.condition.label + "\n");
        }
        else {
            System.out.println("Карлсон и так никуда не взлетал :(");
            System.exit(1);
        }
    }

    public void beScary(Carlson carlson, Child child) {
        if (!(carlson == null) && carlson.getCondition().equals(CarlsonStatus.FLYING)
            && carlson.getCondition().equals(CarlsonStatus.IN_BEDSHEET)) {
            child.startConsternation();
        }
        else child.stopConsternation();
    }

    public Carlson(String name) {
        super(name);
        System.out.println("Карлсон таинственным образом оказался в комнате.");
    }
}
