package SingletonPattern.Singleton;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance(); // 인스턴스 생성, 반환
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance(); // 인스턴스 반환
    }
}

// 멀티 스레드 환경에서의 동기화 문제
// 여러 스레드가 동시에 'getInstance()' 메서드를 호출할 경우
// 두 개 이상의 스레드가 (uniqueInstance == null) 조건을 동시에 통과할 수 있음
// => 두 개의 인스턴스가 생성될 수 있음
