package Enums;

public enum CarlsonStatus {
    NORMAL("спокойно сидит на подоконнике."),
    FLYING("начинает летать по комнате!"),
    IN_BEDSHEET("замотался в простыню и стал похож на приведение.");

    public String label;
    CarlsonStatus(String label) {
        this.label = label;
    }
}
