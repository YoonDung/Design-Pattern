package FactoryPattern.FactoryMethod;

public class PizzaHutBBQPizza extends Pizza {
    public PizzaHutBBQPizza(){
        name = "피자헛 바베큐 피자";
        dough = "피자헛 치즈크러스트 도우";
        sauce = "피자헛 바베큐";
        toppings.add("바베큐");
        toppings.add("치즈");
    }
}
