package FactoryPattern.FactoryMethod;

import java.util.Collections;

public class PizzaHutPepperoniPizza extends Pizza {
    public PizzaHutPepperoniPizza(){
        name = "피자헛 페퍼로니 피자";
        dough = "피자헛 기본 도우";
        sauce = "칠리 소스";
        Collections.addAll(toppings, "페퍼로니", "올리브");
    }
}
