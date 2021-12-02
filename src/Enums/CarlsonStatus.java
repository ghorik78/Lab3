package Enums;

public enum CarlsonStatus {
    NORMAL("спокойно сидит на подоконнике."),
    FLYING("начинает летать по комнате!"),
    WRAPPED("замотался в простыню так, что видны только его маленькие пухлые ручки."),
    UNWRAPPED("размотался и перестал выглядеть жутко.");

    public String label;
    CarlsonStatus(String label) {
        this.label = label;
    }
}
