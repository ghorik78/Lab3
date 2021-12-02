package Things;

import AbstrClasses.SceneObject;
import Entities.Carlson;
import Enums.BedsheetStatus;
import Enums.CarlsonStatus;
import Interfaces.iBedsheet;

import static Enums.BedsheetStatus.FLUTTERING;
import static Enums.BedsheetStatus.NORMAL;

public class Bedsheet extends SceneObject implements iBedsheet {

    public BedsheetStatus condition = NORMAL;

    public void setCondition(BedsheetStatus condition) { this.condition = condition; }

    @Override
    public String toString() {
        return this.name + " " + this.condition.label;
    }

    public void startFluttering(Bedsheet bedsheet) {
        bedsheet.setCondition(FLUTTERING);
        System.out.println(this.toString());
    }

/*    public void stopFluttering(Bedsheet bedsheet) {
        bedsheet.setCondition(BedsheetStatus.NORMAL);
        System.out.println(bedsheet.name + " " + bedsheet.condition.label);
    }*/

    public Bedsheet(String name) {
        super(name);
        System.out.println("Простыня теперь находится в комнате.");
    }
}
