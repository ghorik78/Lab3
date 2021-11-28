package Enums;

public enum BedsheetStatus {
    WRAPPED("завернулся в простыню и стал похож на приведение."),
    UNWRAPPED ("размотался из простыни.");

    public String label;

    BedsheetStatus(String label) { this.label = label; }
}
