package net.media.training.designpattern.abstractfactory;

public class IphoneMaker extends PhoneMaker{
    Case phoneCase;
    @Override
    public MotherBoard tobuildMotherBoard() {
        MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachProcessor(new IphoneProcessor());
        motherBoard.attachBattery(new Battery());
        return motherBoard;
    }

    @Override
    public Screen toMakeScreen() {
        return new Screen();
    }
    @Override
    public Case toBuildPhone() {
        phoneCase.attachMotherBoard(tobuildMotherBoard());
        phoneCase.attachScreen(toMakeScreen());
        return phoneCase;
    }
}
