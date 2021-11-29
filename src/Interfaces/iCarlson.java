package Interfaces;

import Entities.Carlson;
import Enums.CarlsonStatus;
import Things.Chandelier;
import Things.Motor;

public interface iCarlson {
    void setCondition(CarlsonStatus condition);
    CarlsonStatus getCondition();
    void flyAround(Motor motor, Carlson carlson);
    void stopFlying(Motor motor, Carlson carlson);
}
