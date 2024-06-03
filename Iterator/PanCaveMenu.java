package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCaveMenu implements Menu {
	ArrayList<MenuItem> menuItems;
 
	public PanCaveMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("버터 팬케이크",
			"버터로 풍미를 더해 팬케이크 본연의 맛을 올려써요",
			false,
			8500);
 
		addItem("아메리카노",
			"산미없이 깔끔한 맛 에티오피아, 브라질 원두를 섞어 배함",
			true,
			3500);
 
		addItem("치즈 프랜치 토스트",
			"식빵 세장 분량을 치즈와 계란물로 합쳐 포슬포슬하고 든든한 토스트",
			false,
			11900);
 
		addItem("팬케이브 플래터 브런치",
			"다양한 구성의 팬케이브 한 판",
			false,
			13900);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
//	public ArrayList<MenuItem> getMenuItems() {
//		return menuItems;
//	} menuItems 구현을 종업원에게 모두 공개할 필요X
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

}
