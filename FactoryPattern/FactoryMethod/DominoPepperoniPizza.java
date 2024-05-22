package FactoryPattern.FactoryMethod;

import java.util.Collections;

public class DominoPepperoniPizza extends Pizza {
    public DominoPepperoniPizza(){
        name = "도미노 페퍼로니 피자";
        dough = "기본 도우";
        sauce = "칠리 소스";
        Collections.addAll(toppings, "페퍼로니", "올리브");
    }
}
