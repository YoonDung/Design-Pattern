package TemplatemethodPattern.barista;

public class BeverageTestDrive {
	public static void main(String[] args) {
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\n차 만드는 중...");
		teaHook.prepareRecipe();
 
		System.out.println("\n커피 만드는 중...");
		coffeeHook.prepareRecipe();
	}
}
