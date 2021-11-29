package Interfaces;

import Enums.MotorStatus;
import Things.Motor;

public interface iMotor {
    void setCondition(MotorStatus condition);
    void turnOn(Motor motor);
    void turnOff(Motor motor);
    boolean checkMotor(Motor motor);
}
