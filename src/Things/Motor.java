package Things;

import AbstrClasses.SceneObject;
import Enums.MotorStatus;

public class Motor extends SceneObject {

    public MotorStatus condition;

    private void setCondition(MotorStatus condition) {
        this.condition = condition;
    }

    public void turnOn() {
        this.condition = MotorStatus.TURNED_ON;
        System.out.println(this.name + " " + this.condition.label + "\n");
    }

    public void turnOff() {
        this.condition = MotorStatus.TURNED_OFF;
        System.out.println(this.name + " " + this.condition.label + "\n");
    }

    public Motor(String name) {
        super(name);
        condition = MotorStatus.TURNED_OFF;
        System.out.println("У Карлсона на спине появился моторчик.");
    }

}
