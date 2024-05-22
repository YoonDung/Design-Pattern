package DecoratorPattern;

public class ExtraShot extends Decorator{
    public ExtraShot(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + 샷 추가";
    }

    public int cost(){
        return beverage.cost() + 500;
    }
}
