package FactoryPattern.FactoryMethod;

public class DominoCheesePizza extends Pizza {
    public DominoCheesePizza(){
        name = "도미노 치즈 피자";
        dough = "일반 도우";
        sauce = "토마토 소스";
        toppings.add("모짜렐라 치즈");
    }
}
