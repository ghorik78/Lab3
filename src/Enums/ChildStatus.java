package Enums;

public enum ChildStatus {
    NORMAL("полное спокойствие."),
    CONSTERNATION("в ужасе наблюдают за происходящим.");

    public String label;
    ChildStatus(String label) {this.label = label;}
}
