package Composite;

public class MenuTestDrive {
	public static void main(String args[]) {
		MenuComponent pancaveMenu = new Menu("PANCAKE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

		allMenus.add(pancaveMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		pancaveMenu.add(new MenuItem(
				"버터 팬케이크",
				"버터로 풍미를 더해 팬케이크 본연의 맛을 올려써요",
				false,
				8500));
		pancaveMenu.add(new MenuItem(
				"아메리카노",
				"산미없이 깔끔한 맛 에티오피아, 브라질 원두를 섞어 배함",
				true,
				3500));
		pancaveMenu.add(new MenuItem(
				"치즈 프렌치 토스트",
				"식빵 세장 분량을 치즈와 계란물로 합쳐 포슬포슬하고 든든한 토스트",
				false,
				11900));
		pancaveMenu.add(new MenuItem(
				"팬케이브 플래터 브런치",
				"다양한 구성의 팬케이브 한 판",
				false,
				13900));

		dinerMenu.add(new MenuItem(
				"대파 오일파스타",
				"엑스트라 버진에 마늘, 대파를 볶고 대파 튀김으로 풍미를 살린 오일파스타",
				true,
				14900));
		dinerMenu.add(new MenuItem(
				"매콤 빠네 파스타",
				"재주문율 1위를 자랑하는 매콤 빠네 파스타",
				true,
				17900));
		dinerMenu.add(new MenuItem(
				"버섯 카레",
				"생강, 마늘, 사과, 고체카레를 갈아 만든 림표 수제 카레 소스",
				true,
				11900));
		dinerMenu.add(new MenuItem(
				"알리오올리오",
				"엑스트라버진에 마늘을 볶아 만든 매콤한 오일파스타",
				true,
				13900));
		dinerMenu.add(new MenuItem(
				"꽈뜨로 치즈 크림파스타",
				"두유 크림 소스와 4가지 비건 치즈를 곁들인 꾸덕꾸덕 치즈 크림 파스타",
				true,
				17900));
		dinerMenu.add(new MenuItem(
				"포레스트 피자",
				"토마토소스, 각종 야채, 비건치즈로 만든 토마토 피자",
				true,
				16900));

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem(
				"애플파이",
				"바닐라 아이스크림과 크러스트가 올라간 애플파이",
				true,
				3500));
		dessertMenu.add(new MenuItem(
				"치즈케이크",
				"초콜릿칩이 올라간 꾸덕꾸덕 뉴욕식 치즈케이크",
				true,
				4500));
		dessertMenu.add(new MenuItem(
				"소르베",
				"라즈베리 한스쿱에 라임 한스쿱",
				true,
				4000));

		cafeMenu.add(new MenuItem(
				"비건 두유 푸딩",
				"두유럽미만의 수제 두유로 만든 4가지 맛의 비건 두유 푸딩",
				true,
				4500));
		cafeMenu.add(new MenuItem(
				"생과일 비건 파르페",
				"두유 아이스크림과 크럼블쿠키, 제철 과일이 어루어진 비건 파르페",
				true,
				6500));
		cafeMenu.add(new MenuItem(
				"두유 휘낭시에",
				"수제 두유와 식물성 재료만을 넣어 만든 촉촉한 비건 휘낭시에",
				true,
				2500));

		Waitress waitress = new Waitress(allMenus);
		waitress.printVegetarianMenu();
		//waitress.printMenu();
	}
}
