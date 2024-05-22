package FactoryPattern.FactoryMethod;

public class DominoShrimpPizza extends Pizza {
    public DominoShrimpPizza(){
        name = "도미노 쉬림프 피자";
        dough = "도미노 치즈크러스트 도우";
        sauce = "도미노 특제 소스";
        toppings.add("새우");
    }
}
