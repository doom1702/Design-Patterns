package net.media.training.designpattern.strategy;

public class EmptyValidator implements ValidationStrategy {
    private String val;
    EmptyValidator(String val){
        this.val = val;
    }
    public void validate(){
        if (val == null || val.length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }
}
