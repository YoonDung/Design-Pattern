package FactoryPattern.SimpleFactory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "치즈 피자";
        dough = "치즈 크러스트";
        sauce = "치즈소스";
        toppings.add("모짜렐라치즈");
        toppings.add("체다치즈");
    }
}
