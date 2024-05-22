package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Singer implements Talent {
    private int price;
    private List<Fan> fans;

    public Singer() {
        fans = new ArrayList<>();
    }

    @Override
    public void addFan(Fan f) {
        fans.add(f);
    }

    @Override
    public void deleteFan(Fan f) {
        fans.remove(f);
    }

    @Override
    public void notifyFan() {
        // fans.forEach(f -> f.update(price)); // 람다식 사용
        fans.forEach(f -> f.update()); // pull
    }

    public void setPrice(int price) {
        this.price = price;
        notifyFan();
    }

    public int getPrice() { //pull
        return price;
    }
}

