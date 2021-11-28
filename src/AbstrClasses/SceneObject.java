package AbstrClasses;

public abstract class SceneObject {
    public String name;
    private Enum condition;

    public SceneObject(String name) {
        this.name = name;
    }

    public Enum getCondition() { return this.condition; }

    public void setCondition(Enum condition) {
        this.condition = condition;
    }

}
