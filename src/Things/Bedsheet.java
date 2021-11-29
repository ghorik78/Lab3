package Things;

import AbstrClasses.SceneObject;
import Entities.Carlson;
import Enums.BedsheetStatus;
import Enums.CarlsonStatus;
import Interfaces.iBedsheet;

public class Bedsheet extends SceneObject implements iBedsheet {

    public BedsheetStatus condition;

    public void setCondition(BedsheetStatus condition) { this.condition = condition; }

    public void startFluttering(Bedsheet bedsheet) {
        bedsheet.setCondition(BedsheetStatus.FLUTTERING);
        System.out.println(bedsheet.name + " " + bedsheet.condition.label);
    }

    public void stopFluttering(Bedsheet bedsheet) {
        bedsheet.setCondition(BedsheetStatus.NORMAL);
        System.out.println(bedsheet.name + " " + bedsheet.condition.label);
    }

    public void wrapUpCarlson(Carlson carlson) {
        carlson.setCondition(CarlsonStatus.WRAPPED);
        System.out.println(carlson.name + " " + carlson.condition.label);
    }

    public void unwrapCarlson(Carlson carlson) {
        carlson.setCondition(CarlsonStatus.UNWRAPPED);
        System.out.println(carlson.name + " " + carlson.condition.label);
    }

    public Bedsheet(String name) {
        super(name);
        System.out.println("Простыня теперь находится в комнате.");
    }
}
