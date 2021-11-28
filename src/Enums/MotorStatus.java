package Enums;

public enum MotorStatus {
    TURNED_ON("Моторчик завёлся и начал тарахтеть."),
    TURNED_OFF("Моторчик выключился и перестал тарахтеть.");

    public String label;
    MotorStatus(String label) {
        this.label = label;
    }
}
