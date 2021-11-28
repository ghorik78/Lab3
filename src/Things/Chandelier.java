package Things;

import AbstrClasses.SceneObject;
import Enums.CarlsonStatus;
import Enums.ChandelierStatus;

public class Chandelier extends SceneObject {

    public ChandelierStatus condition = ChandelierStatus.NORMAL;

    private void setCondition(CarlsonStatus condition) {
        this.condition = ChandelierStatus.NORMAL;
    };

    public void startSwaying() {
        this.setCondition(ChandelierStatus.SWAYING);
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public void stopSwaying() {
        this.setCondition(ChandelierStatus.NORMAL);
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public Chandelier (String name) {
        super(name);
        System.out.println("Люстра висит на потолке комнаты.");
    }

}
