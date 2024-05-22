package StrategyPattern;

public class Seventeen extends Student{
    public Seventeen(){
        alcoholable = new Minor();
        driveable = new NoLicense();
    }

    @Override
    public void outfit() {
        System.out.println("저는 고1입니다. 교복을 입어요!");
    }
}
