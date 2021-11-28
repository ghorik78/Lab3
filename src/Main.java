import Entities.*;
import Room.Story;
import Things.*;

public class Main {

    public static void main(String[] args) {
	    Story story = new Story();

        story.addMotor(new Motor("Моторчик"));
        story.addCarlson(new Carlson("Карлсон"));
        story.addBedsheet(new Bedsheet("Простыня"));
        story.addChandelier(new Chandelier("Люстра"));
        story.addChild(new Child("Дети"));
        story.addDog(new Dog("Эффа"));

        story.go();

    }
}
