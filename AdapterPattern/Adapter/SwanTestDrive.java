package AdapterPattern.Adapter;

public class SwanTestDrive {
    public static void main(String[] args) {
        RuberDuck duck = new RuberDuck();
        Swan duckAdapter = new DuckAdapter(duck);

        System.out.println("오리 어댑터가 말하길...");
            duckAdapter.quack();
            duckAdapter.fly();
    }
}