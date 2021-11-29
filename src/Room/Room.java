package Room;

import Entities.Carlson;
import Entities.Child;
import Entities.Dog;
import Things.*;

import java.util.concurrent.TimeUnit;


public final class Room {
    private Motor motor;
    private Child child;
    private Carlson carlson;
    private Chandelier chandelier;
    private Bedsheet bedsheet;
    private Dog dog;

    public void addMotor(Motor motor) { this.motor = motor; }
    public void addChild(Child child) { this.child = child; }
    public void addCarlson(Carlson carlson) { this.carlson = carlson; }
    public void addChandelier(Chandelier chandelier) { this.chandelier = chandelier; }
    public void addBedsheet(Bedsheet bedsheet) { this.bedsheet = bedsheet; }
    public void addDog(Dog dog) { this.dog = dog; }

    public void sleeping(int time) {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {

        }
    }

   public void go() {
        System.out.println();
        sleeping(750);
        bedsheet.wrapUpCarlson(carlson);
        sleeping(750);
        child.startConsternation();
        dog.startBarking();
        sleeping(750);
        motor.turnOn(motor);
        sleeping(750);
        carlson.flyAround(motor, carlson);
        bedsheet.startFluttering(bedsheet);
        chandelier.startSwaying();
        sleeping(750);
        System.out.println("\nЖуткое зрелище...");
   }

}

