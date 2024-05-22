package FactoryPattern.FactoryMethod;

public class DominoStore extends PizzaStore {

    @Override
    FactoryPattern.SimpleFactory.Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new DominoCheesePizza();
        } else if (item.equals("BBQ")) {
            return new DominoBBQPizza();
        } else if (item.equals("Pepperoni")) {
            return new DominoPepperoniPizza();
        } else if (item.equals("Shrimp")){
            return new DominoShrimpPizza();
        } else return null;
    }
}
