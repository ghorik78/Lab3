package Enums;

public enum ChildStatus {
    NORMAL("полное спокойствие."),
    CONSTERNATION("знают, что это Карлсон, но им всё равно жутко.");

    public String label;
    ChildStatus(String label) {this.label = label;}
}
