package FactoryPattern.SimpleFactory;

public class DeliverySystem {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("\n");
        System.out.println(pizza);
        System.out.println("\n");

        pizza = store.orderPizza("BBQ");
        System.out.println("\n");
        System.out.println(pizza);
    }
}

// 간단한 팩토리로 구현시 신메뉴가 생기거나 기존 메뉴가 없어질 경우 / 재료가 바뀔경우 기존 코드를 전부 수정해야함 (OCP위반)