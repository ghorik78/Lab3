package Entities;

import AbstrClasses.SceneObject;
import Enums.DogStatus;

public class Dog extends SceneObject {

    private DogStatus condition = DogStatus.NORMAL;

    public void startBarking() {
        this.condition = DogStatus.BARKING;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public void stopBarking() {
        this.condition = DogStatus.NORMAL;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public Dog(String name) {
        super(name);
        System.out.println("Эффа забежала в комнату.");
    }
}
