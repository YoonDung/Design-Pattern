package FactoryPattern.FactoryMethod;

public class PizzaHutShrimpPizza extends Pizza {
    public PizzaHutShrimpPizza(){
        name = "피자헛 쉬림프 피자";
        dough = "피자헛 치즈크러스트 도우";
        sauce = "피자헛 특제 소스";
        toppings.add("새우");
    }
}
