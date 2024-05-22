package FactoryPattern.FactoryMethod;

import FactoryPattern.SimpleFactory.Pizza;

public class DeliverySystem {
    public static void main(String[] args) {
        PizzaStore domino = new DominoStore();
        PizzaStore pizzahut = new PizzaHutStore();

        Pizza pizza = domino.orderPizza("cheese");
        System.out.println("\n");

        pizza = pizzahut.orderPizza("Pepperoni");
        System.out.println("\n");
    }
}

// 팩토리 메소드 패턴 : 사용하는 서브 클래스에 따라 생산되는 객체 인스턴스 결정 (생산자 클래스 / 제품 클래스)