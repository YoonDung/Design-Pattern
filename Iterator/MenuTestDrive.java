package Iterator;

public class MenuTestDrive {
	public static void main(String args[]) {
		PanCaveMenu pancakeHouseMenu = new PanCaveMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\n손님 : 이 파스타는 비건식인가요?");
		System.out.print("웨이터 : ");
		if (waitress.isItemVegetarian("꽈뜨로 치즈 크림파스타")) {
			System.out.println("네. 비건식입니다.");
		} else {
			System.out.println("아니요. 비건식이 아닙니다.");
		}
		System.out.println("\n손님 : 이 브런치는 비건식인가요?");
		System.out.print("웨이터 : ");
		if (waitress.isItemVegetarian("팬케이브 플래터 브런치")) {
			System.out.println("네. 비건식입니다.");
		} else {
			System.out.println("아니요. 비건식이 아닙니다.");
		}
	}
}
