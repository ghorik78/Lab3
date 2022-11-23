import Entities.*;
import Enums.*;
import Room.*;
import Things.*;

public class Main {

    public static void main(String[] args) {
	    Room room = new Room();

        room.addCarlson(new Carlson("Карлсон"));
        room.addMotor(new Motor("Моторчик"));
        room.addBedsheet(new Bedsheet("Простыня"));
        room.addChandelier(new Chandelier("Люстра"));
        room.addChild(new Child("Дети"));
        room.addDog(new Dog("Эффа"));

        room.go();

    }
}
