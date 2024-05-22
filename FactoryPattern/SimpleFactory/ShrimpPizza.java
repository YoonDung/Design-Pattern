package FactoryPattern.SimpleFactory;

public class ShrimpPizza extends Pizza {
    public ShrimpPizza() {
        name = "쉬림프 피자";
        dough = "치즈 크러스트";
        sauce = "칠리 소스";
        toppings.add("새우");
    }
}
