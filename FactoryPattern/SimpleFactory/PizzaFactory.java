package FactoryPattern.SimpleFactory;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("BBQ")) {
            pizza = new BBQPizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("Shrimp")) {
            pizza = new ShrimpPizza();
        }
        return pizza;
    }
}

// 변화하는 부분
