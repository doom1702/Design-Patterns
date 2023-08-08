package net.media.training.designpattern.strategy;

public class LeastValidator implements ValidationStrategy {

    private int val;
    private int min;

    LeastValidator(int val,int min){
        this.val = val;
        this.min = min;
    }
    public void validate(){
        if (val < min)
            throw new RuntimeException("at least check failed:" + val);
    }
    
}
