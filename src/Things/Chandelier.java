package Things;

import AbstrClasses.SceneObject;
import Enums.CarlsonStatus;
import Enums.ChandelierStatus;
import Interfaces.iChandelier;

public class Chandelier extends SceneObject implements iChandelier {

    public ChandelierStatus condition = ChandelierStatus.NORMAL;

    public void setCondition(ChandelierStatus condition) {
        this.condition = condition;
    };

    public void startSwaying() {
        this.condition = ChandelierStatus.SWAYING;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public void stopSwaying() {
        this.condition = ChandelierStatus.NORMAL;
        System.out.print(this.name + " " + this.condition.label + "\n");
    }

    public Chandelier (String name) {
        super(name);
        System.out.println("Люстра висит на потолке комнаты.");
    }

}
