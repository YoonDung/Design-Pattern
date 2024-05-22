package FactoryPattern.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza extends FactoryPattern.SimpleFactory.Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

    public void prepare() {
        System.out.println("\n");
        System.out.println("이름: " + name);
        System.out.println("도우: " + dough);
        System.out.println("소스: " + sauce);
        System.out.println("토핑");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
        System.out.println("\n");
    }

    public void bake() {
        System.out.println(name + " 굽기!");
    }

    public void cut() {
        System.out.println(name + " 사선으로 커팅!");
    }

    public void box() {
        System.out.println(name + " 박스 포장!");
    }
}
