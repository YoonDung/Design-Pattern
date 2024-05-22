package DecoratorPattern;

public class Decaf extends Beverage{
    public Decaf() {
        description = "디카페인";
    }

    public int cost() {
        return 2500;
    }
}
