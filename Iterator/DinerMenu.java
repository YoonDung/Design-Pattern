package Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("대파 오일파스타",
			"엑스트라 버진에 마늘, 대파를 볶고 대파 튀김으로 풍미를 살린 오일파스타", true, 14900);
		addItem("매콤 빠네 파스타",
			"재주문율 1위를 자랑하는 매콤 빠네 파스타", true, 17900);
		addItem("버섯 카레",
			"생강, 마늘, 사과, 고체카레를 갈아 만든 림표 수제 카레 소스", true, 11900);
		addItem("알리오올리오",
			"엑스트라버진에 마늘을 볶아 만든 매콤한 오일파스타",
			true, 13900);
		addItem("꽈뜨로 치즈 크림파스타",
			"두유 크림 소스와 4가지 비건 치즈를 곁들인 꾸덕꾸덕 치즈 크림 파스타", true, 17900);
		addItem("포레스트 피자",
			"토마토소스, 각종 야채, 비건치즈로 만든 토마토 피자",
			true, 16900);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("죄송하지만, 메뉴가 꽉차서 더 이상 추가 할 수 없습니다!");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
  
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}
