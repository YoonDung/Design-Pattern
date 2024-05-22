package DecoratorPattern;

public class Cafe {
    public static void main(String[] args) {
        Beverage beverage1 = new Decaf();
        beverage1 = new Ice(beverage1);
        beverage1 = new ExtraShot((beverage1));
        System.out.println(beverage1.getDescription() + "\n" + beverage1.cost() + "원 입니다!");
        System.out.println("\n");

        Beverage beverage2 = new LemonAde();
        beverage2 = new Ice(beverage2);
        System.out.println(beverage2.getDescription() + "\n" + beverage2.cost() + "원 입니다!");
        System.out.println("\n");

        Beverage beverage3 = new Tea();
        System.out.println(beverage3.getDescription() + "\n" + beverage3.cost() + "원 입니다!");
        System.out.println("\n");

        Beverage beverage4 = new LemonAde();
        beverage4 = new Ice(new Zero(beverage4));
        System.out.println(beverage4.getDescription() + "\n" + beverage4.cost() + "원 입니다!");

    }
}
