package DecoratorPattern;

public class Coldbrew extends Beverage{
    public Coldbrew() {
        description = "콜드브루";
    }

    public int cost() {
        return 2000;
    }
}
