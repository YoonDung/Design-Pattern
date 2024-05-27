package SingletonPattern.Synchronized;

import SingletonPattern.Singleton.ChocolateBoiler;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance(); // 인스턴스 생성, 반환
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance(); // 인스턴스 반환
    }
}

