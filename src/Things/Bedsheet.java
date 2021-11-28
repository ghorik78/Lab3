package Things;

import AbstrClasses.SceneObject;
import Entities.Carlson;
import Enums.BedsheetStatus;

public class Bedsheet extends SceneObject {

    public BedsheetStatus condition = BedsheetStatus.UNWRAPPED;

    public void wrapUp(Carlson carlson) {
        this.setCondition(BedsheetStatus.WRAPPED);
        System.out.print(carlson.name + " " + this.condition.label + "\n");
    }

    public void unwrap() {
        this.setCondition(BedsheetStatus.UNWRAPPED);
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public Bedsheet(String name) {
        super(name);
        System.out.println("Простыня теперь находится в комнате.");
    }
}
