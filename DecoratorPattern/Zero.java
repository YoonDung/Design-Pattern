package DecoratorPattern;

public class Zero extends Decorator {
    public Zero(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + 제로";
    }

    public int cost(){
        return beverage.cost() + 0;
    }
}
