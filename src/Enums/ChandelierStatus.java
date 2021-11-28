package Enums;

public enum ChandelierStatus {
    NORMAL("спокойно висит."),
    SWAYING("начала качаться из-за полётов Карлсона.");

    public String label;
    ChandelierStatus(String label) {
        this.label = label;
    }
}
