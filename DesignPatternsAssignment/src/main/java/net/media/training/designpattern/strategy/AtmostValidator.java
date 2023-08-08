package net.media.training.designpattern.strategy;

public class AtmostValidator implements ValidationStrategy{

    private int val;
    private int max;

    AtmostValidator(int val,int max){
        this.max = max;
        this.val = val;
    }

    public void validate(){
        if (val > max)
            throw new RuntimeException("at least check failed:" + val);
    }
    
}
