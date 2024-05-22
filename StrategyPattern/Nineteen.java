package StrategyPattern;

public class Nineteen extends Student{
    public Nineteen(){
        alcoholable = new Minor();
        driveable = new NoLicense();
    }

    @Override
    public void outfit() {
        System.out.println("저는 고3이에요. 교복을 입어요.");
    }
}
