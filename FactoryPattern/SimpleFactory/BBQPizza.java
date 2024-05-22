package FactoryPattern.SimpleFactory;

public class BBQPizza extends Pizza {
    public BBQPizza() {
        name = "바베큐 피자";
        dough = "크리스피 도우";
        sauce = "바베큐 소스";
        toppings.add("돼지고기");
    }
}
