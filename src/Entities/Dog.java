package Entities;

import AbstrClasses.SceneObject;
import Enums.DogStatus;
import Interfaces.iDog;

import static Enums.DogStatus.BARKING;

public class Dog extends SceneObject implements iDog {

    private DogStatus condition = DogStatus.NORMAL;

    public void setCondition(DogStatus condition) {this.condition = condition; }

    @Override
    public String toString() {
        return this.name + " " + this.condition.label;
    }

    public void startBarking() {
        this.setCondition(BARKING);
        System.out.println(this.toString());
    }

    /*public void startBarking() {
        this.condition = DogStatus.BARKING;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }*/

    public Dog(String name) {
        super(name);
        System.out.println("Эффа забежала в комнату.");
    }
}
