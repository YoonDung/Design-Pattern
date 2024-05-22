package FactoryPattern.FactoryMethod;

import FactoryPattern.SimpleFactory.Pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("== 띵동! 요기요 주문! == \n" + pizza.getName() + "가 주문되었습니다.");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}