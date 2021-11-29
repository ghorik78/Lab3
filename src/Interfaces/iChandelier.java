package Interfaces;

import Enums.ChandelierStatus;

public interface iChandelier {
    void setCondition(ChandelierStatus condition);
    void startSwaying();
    void stopSwaying();
}
