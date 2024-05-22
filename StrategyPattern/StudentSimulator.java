package StrategyPattern;

public class StudentSimulator {
    public static void main(String[] args) {
        Student Nineteen = new Nineteen();
        Student Seventeen = new Seventeen();
        Student Twenty = new Twenty();

        Nineteen.outfit();
        Nineteen.performDrive();
        Nineteen.performAlcohol();
        Nineteen.setDriveable(new GetLicense()); // 세터메소드를 호출하여 동적으로 행동을 바꿀 수 있음
        Nineteen.performDrive();
        System.out.println("\n");

        Seventeen.outfit();
        Seventeen.performDrive();;
        Seventeen.performAlcohol();
        System.out.println("\n");

        Twenty.outfit();
        Twenty.performDrive();
        Twenty.performAlcohol();
        Twenty.study();
    }
}

// 전략패턴
// 1. 달라지는 부분을 찾아내서 캡슐화 (Alcoholable, Driveable)
// 2. 구현보다는 인터페이스 / 상속보다는 구성!
