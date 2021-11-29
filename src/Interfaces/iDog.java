package Interfaces;

import Enums.ChandelierStatus;
import Enums.DogStatus;

public interface iDog {
    void setCondition(DogStatus condition);
    void startBarking();
    void stopBarking();
}
