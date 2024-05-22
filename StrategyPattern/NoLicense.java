package StrategyPattern;

public class NoLicense implements Driveable{
    public void drive(){
        System.out.println("운전 불가능! 면허부터 따자!^^");
    }
}
