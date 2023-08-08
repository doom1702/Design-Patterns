package net.media.training.designpattern.strategy;

public class LengthValidator implements ValidationStrategy {

    private String name;
    private int allowedLength;

    LengthValidator(String name, int allowedLength) {
        this.name = name;
        this.allowedLength = allowedLength;
    }

    public void validate() {
        if (name.length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }

}
