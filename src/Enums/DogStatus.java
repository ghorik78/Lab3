package Enums;

public enum DogStatus {
    BARKING("начинает свирепо лаять."),
    NORMAL("успокаивается и перестаёт лаять.");

    public String label;
    DogStatus(String label) {
        this.label = label;
    }
}
