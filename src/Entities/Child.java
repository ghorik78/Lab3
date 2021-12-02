package Entities;

import AbstrClasses.SceneObject;
import Enums.ChildStatus;
import Interfaces.iChild;

import static Enums.ChildStatus.*;

public class Child extends SceneObject implements iChild {

    private ChildStatus condition = ChildStatus.NORMAL;

    public void setCondition(ChildStatus condition) { this.condition = condition; }

    @Override
    public String toString() {
        return this.name + " " + this.condition.label;
    }

    public void startConsternation() {
        this.setCondition(CONSTERNATION);
        System.out.println(this.toString());
    }

    public void stopConsternation() {
        this.setCondition(NORMAL);
        System.out.print(this.toString());
    }

    public Child(String name) {
        super(name);
        System.out.println("Дети вошли в комнату.");
    }
}