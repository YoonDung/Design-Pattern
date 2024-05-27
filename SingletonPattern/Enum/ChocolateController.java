package SingletonPattern.Enum;

import SingletonPattern.Enum.ChocolateBoiler;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler.UNIQUE_INSTANCE.boil();
        ChocolateBoiler.UNIQUE_INSTANCE.drain();
        ChocolateBoiler.UNIQUE_INSTANCE.fill();
    }
}