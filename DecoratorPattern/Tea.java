package DecoratorPattern;

public class Tea extends Beverage{
    public Tea(){
        description = "차";
    }

    public int cost() {
        return 2000;
    }
}
