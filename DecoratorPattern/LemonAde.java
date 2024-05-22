package DecoratorPattern;

public class LemonAde extends Beverage{
    public LemonAde(){
        description = "레몬에이드";
    }

    public int cost() {
        return 3500;
    }
}
