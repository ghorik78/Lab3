package Entities;

import AbstrClasses.SceneObject;
import Enums.*;
import Interfaces.iCarlson;
import Things.*;

import java.util.Objects;

import static Enums.CarlsonStatus.*;

public class Carlson extends SceneObject implements iCarlson {

    public CarlsonStatus condition = NORMAL;


    public void setCondition(CarlsonStatus condition) {
        this.condition = condition;
    }

    public CarlsonStatus getCondition() { return this.condition; }

    @Override
    public String toString() {
        return this.name + " " + this.condition.label;
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition);
    }

    public void flyAround(Motor motor, Carlson carlson) {
        if (motor.checkMotor(motor)) {
            this.setCondition(FLYING);
            System.out.println(this.toString());
        }
        else {
            System.out.println("Карлсон не может взлететь с выключенным моторчиком!");
            System.exit(1);
        }
    }

    public void wrapUp(Bedsheet bedsheet) {
        this.setCondition(WRAPPED);
        System.out.println(this.toString());
    }

/*public void stopFlying(Motor motor, Carlson carlson) {
        if (!(motor == null) && !(carlson == null) && motor.checkMotor(motor)) {
            carlson.setCondition(CarlsonStatus.NORMAL);
            motor.condition = MotorStatus.TURNED_OFF;
            System.out.println(this.name + " " + this.condition.label + "\n");
        }
        else {
            System.out.println("Карлсон и так никуда не взлетал :(");
            System.exit(1);
        }
    }*/

    public Carlson(String name) {
        super(name);
        System.out.println("Карлсон таинственным образом оказался в комнате.");
    }
}
