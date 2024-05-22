package FactoryPattern.FactoryMethod;

public class PizzaHutCheesePizza extends Pizza {
    public PizzaHutCheesePizza(){
        name = "피자헛 치즈 피자";
        dough = "피자헛 크리스피 도우";
        sauce = "피자헛 치즈소스";
        toppings.add("모짜렐라 치즈");
    }
}
