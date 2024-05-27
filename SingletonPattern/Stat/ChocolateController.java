package SingletonPattern.Stat;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
// uniqueInstance가 이미 초기화되어 있기 때문에
// getInstance() 메서드가 처음 호출될때만 인스턴스를 반환
// boiler, boiler2 선언시에만 인스턴스 반환
