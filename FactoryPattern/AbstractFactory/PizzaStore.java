package FactoryPattern.AbstractFactory;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("=== 주문이 들어왔습니다 ===");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println("\n");
		return pizza;
	}
}
