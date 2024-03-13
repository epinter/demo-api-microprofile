package dev.pinter.apidemo;

public class Message {
    private String format = "Hello %s";
    private String name;

    public Message(String name) {
        this.name = name;
    }

    public String getName() {
        return String.format(format, name);
    }
}
