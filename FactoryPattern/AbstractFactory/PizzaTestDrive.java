package FactoryPattern.AbstractFactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore busanStore = new BusanPizzaStore();
		PizzaStore seoulStore = new SeoulPizzaStore();

		Pizza pizza = busanStore.orderPizza("cheese");
		System.out.println("산들은 " + pizza + "주문\n");

		pizza = seoulStore.orderPizza("cheese");
		System.out.println("유진은 " + pizza + "주문\n");

		pizza = busanStore.orderPizza("clam");
		System.out.println("은지는 " + pizza + "주문\n");

		pizza = seoulStore.orderPizza("clam");
		System.out.println("원영은 " + pizza + "주문\n");

		pizza = busanStore.orderPizza("pepperoni");
		System.out.println("경리는" + pizza + "주문\n");

		pizza = seoulStore.orderPizza("pepperoni");
		System.out.println("이서는 " + pizza + "주문\n");

		pizza = busanStore.orderPizza("veggie");
		System.out.println("아린은 " + pizza + "주문\n");

		pizza = seoulStore.orderPizza("veggie");
		System.out.println("효정은 " + pizza + "주문\n");
	}
}

// 추상화팩토리패턴 : 구상클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스 제공 (DIP)