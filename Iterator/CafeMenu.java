package Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
  
	public CafeMenu() {
		addItem("비건 두유 푸딩",
			"두유럽미만의 수제 두유로 만든 4가지 맛의 비건 두유 푸딩",
			true, 4500);
		addItem("생과일 비건 파르페",
			"두유 아이스크림과 크럼블쿠키, 제철 과일이 어루어진 비건 파르페",
			true, 6500);
		addItem("두유 휘낭시에",
			"수제 두유와 식물성 재료만을 넣어 만든 촉촉한 비건 휘낭시에",
			true, 2500);
	}
 
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(name, menuItem);
	}
 
//	public Map<String, MenuItem> getItems() {
//		return menuItems;
//	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}
