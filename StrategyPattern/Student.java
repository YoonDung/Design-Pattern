package StrategyPattern;

public abstract class Student {
    Alcoholable alcoholable;
    Driveable driveable;

    public Student() {}

    public abstract void outfit();

    public void setAlcoholable(Alcoholable ac) {
        alcoholable = ac;
    }

    public void setDriveable(Driveable dr) {
        driveable = dr;
    }
    public void performAlcohol() {
        alcoholable.alcohol();
    }

    public void performDrive() {
        driveable.drive();
    }
    // able 클래스에 위임

    public void study() {
        System.out.println("모든 학생은 공부를 합니다!");
    }
}
