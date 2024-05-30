package TemplatemethodPattern.barista;

public class Tea extends CaffeineBeverageWithHook {
	public void brew() {
		System.out.println("찻잎을 우려내는 중");
	}
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중");
	}
}
