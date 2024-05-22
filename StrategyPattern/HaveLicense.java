package StrategyPattern;

public class HaveLicense implements Driveable{
    public void drive() {
        System.out.println("운전면허증 있으면 운전 가능!");
    }
}
