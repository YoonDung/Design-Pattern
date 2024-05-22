package FactoryPattern.SimpleFactory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "페퍼로니 피자";
        dough = "기본 도우";
        sauce = "칠리 소스";
        toppings.add("페퍼로니");
        toppings.add("올리브");
    }
}
