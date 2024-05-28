package CommandPattern;

public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println(location + "조명 온!");
    }

    public void off() {
        level = 0;
        System.out.println(location + "조명 오프!");
    }
    public int getLevel() {
        return level;
    }
}

