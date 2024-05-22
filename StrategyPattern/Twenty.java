package StrategyPattern;

public class Twenty extends Student {
    public Twenty() {
        alcoholable = new Adult();
        driveable = new HaveLicense();
    }

    @Override
    public void outfit() {
        System.out.println("대학생은 사복을 입어요!");
    }
}
