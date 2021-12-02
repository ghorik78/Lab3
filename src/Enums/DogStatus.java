package Enums;

public enum DogStatus {
    BARKING("бешено залаял."),
    NORMAL("успокаился и перестал бешено лаять.");

    public String label;
    DogStatus(String label) {
        this.label = label;
    }
}
