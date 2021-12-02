package Things;

import AbstrClasses.SceneObject;
import Enums.ChandelierStatus;
import Interfaces.iChandelier;
import static Enums.ChandelierStatus.SWAYING;

public class Chandelier extends SceneObject implements iChandelier {

    public ChandelierStatus condition = ChandelierStatus.NORMAL;

    public void setCondition(ChandelierStatus condition) {
        this.condition = condition;
    };

    @Override
    public String toString() {
        return this.name + " " + this.condition.label;
    }

    public void startSwaying() {
        this.setCondition(SWAYING);
        System.out.println(this.toString());
    }

/*    public void stopSwaying() {
        this.condition = ChandelierStatus.NORMAL;
        System.out.println(this.toString());
    }*/

    public Chandelier (String name) {
        super(name);
        System.out.println("Люстра висит на потолке комнаты.");
    }

}
