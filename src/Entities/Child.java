package Entities;

import AbstrClasses.SceneObject;
import Enums.ChildStatus;

public class Child extends SceneObject {

    private ChildStatus condition = ChildStatus.NORMAL;

    public Child(String name) {
        super(name);
        System.out.println("Дети вошли в комнату.");
    }

    public void startConsternation() {
        this.condition = ChildStatus.CONSTERNATION;
        System.out.println(this.name + " " + this.condition.label + "\n");
    }

    public void stopConsternation() {
        this.condition = ChildStatus.NORMAL;
        System.out.println(this.name + " " + this.condition.label + "\n");
    }
}