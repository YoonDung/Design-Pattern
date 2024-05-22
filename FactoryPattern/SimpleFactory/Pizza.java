package FactoryPattern.SimpleFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

    public void prepare() {
        System.out.println(name + " 준비!");
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
