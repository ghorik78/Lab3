package Things;

import AbstrClasses.SceneObject;
import Enums.MotorStatus;
import Interfaces.iMotor;

public class Motor extends SceneObject implements iMotor {

    public MotorStatus condition;

    public void setCondition(MotorStatus condition) {
        this.condition = condition;
    }

    public void turnOn(Motor motor) {
        motor.condition = MotorStatus.TURNED_ON;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public void turnOff(Motor motor) {
        motor.condition = MotorStatus.TURNED_OFF;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public boolean checkMotor(Motor motor) {
        return motor.condition.equals(MotorStatus.TURNED_ON);
    }

    public Motor(String name) {
        super(name);
        condition = MotorStatus.TURNED_OFF;
        System.out.println("У Карлсона на спине появился моторчик.");
    }

}
