package Enums;

public enum BedsheetStatus {
    NORMAL("находится в обычном состоянии."),
    FLUTTERING("жутко развевается.");

    public String label;

    BedsheetStatus(String label) { this.label = label; }
}
