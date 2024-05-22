package DecoratorPattern;

public class Ice extends Decorator{
    public Ice(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " + 아이스";
    }

    public int cost() {
        return beverage.cost() + 500;
    }
}
