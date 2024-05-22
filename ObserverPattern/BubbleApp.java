package ObserverPattern;

public class BubbleApp {
    public static void main(String[] args) {
        Singer singer = new Singer();
        KoreanFan fan1 = new KoreanFan("장원영", singer);
        KoreanFan fan2 = new KoreanFan("안유진", singer);
        KoreanFan fan3 = new KoreanFan("리즈", singer);
        singer.setPrice(30000);
        System.out.println("\n");

        Fan fan4 = new KoreanFan("이서", singer);
        singer.setPrice(20000);
        System.out.println("\n");

        singer.deleteFan(fan2);
        System.out.println("\n");

        Fan fan5 = new AboardFan("Lay", singer);
        singer.setPrice(10000);
    }
}
