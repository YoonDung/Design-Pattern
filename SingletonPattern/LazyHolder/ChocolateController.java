package SingletonPattern.LazyHolder;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        // LazyHolder에서는 'getInstance()` 메서드가 호출될 때마다 새로운 인스턴스 생성X / 이미 생성된 인스턴스 반환
        // (실제로 인스턴스가 필요한 시점에서만 생성되어 메모리 절약)
        System.out.println("\n");
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
