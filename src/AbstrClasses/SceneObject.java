package AbstrClasses;

import Entities.Carlson;
import Enums.CarlsonStatus;
import Enums.MotorStatus;

public abstract class SceneObject<T> {
    public String name;

    public SceneObject(String name) {
        this.name = name;
    }
}
