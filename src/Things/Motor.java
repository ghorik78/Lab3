package Things;

import AbstrClasses.SceneObject;
import Enums.MotorStatus;
import Interfaces.iMotor;

import java.util.Objects;

import static Enums.MotorStatus.TURNED_OFF;
import static Enums.MotorStatus.TURNED_ON;

public class Motor extends SceneObject implements iMotor {

    public MotorStatus condition = TURNED_OFF;

    public void setCondition(MotorStatus condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return this.name + " " + this.condition.label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return condition == motor.condition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition);
    }

    public void turnOn(Motor motor) {
        motor.condition = TURNED_ON;
        System.out.println(this.toString());
    }

    public void turnOff(Motor motor) {
        motor.condition = TURNED_OFF;
        System.out.println(this.toString());
    }

    public boolean checkMotor(Motor motor) {
        return motor.condition.equals(TURNED_ON);
    }

    public Motor(String name) {
        super(name);
        System.out.println("У Карлсона на спине появился моторчик.");
    }

}
