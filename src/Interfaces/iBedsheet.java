package Interfaces;

import Entities.Carlson;
import Enums.BedsheetStatus;
import Enums.CarlsonStatus;
import Things.Bedsheet;

public interface iBedsheet {
    void setCondition(BedsheetStatus condition);
    void startFluttering(Bedsheet bedsheet);
}
