package DecoratorPattern;

public class SizeUp extends Decorator{
    public SizeUp(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "+ 사이즈업";
    }

    public int cost() {
        return beverage.cost() + 1000;
    }
}
