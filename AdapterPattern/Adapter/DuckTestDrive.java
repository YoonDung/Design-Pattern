package AdapterPattern.Adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new RuberDuck();

        Swan swan = new BlackSwan();
        Duck swanAdapter = new SwanAdapter(swan);

        System.out.println("검정 백조가 말하길...");
        swan.quack();
        swan.fly();
        System.out.println("\n");

        System.out.println("러버덕이 말하길...");
        testDuck(duck);
        System.out.println("\n");

        System.out.println("백조 어댑터가 말하길...");
        testDuck(swanAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
