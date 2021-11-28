package Room;

import java.util.ArrayList;

import Entities.Carlson;
import Entities.Child;
import Entities.Dog;
import Enums.MotorStatus;
import Things.*;


public final class Story {
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

   public void go() {
        bedsheet.wrapUp(carlson);
        motor.turnOn();
        carlson.flyAround(motor, carlson, chandelier);
   }

}

