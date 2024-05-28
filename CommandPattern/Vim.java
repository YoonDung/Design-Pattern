package CommandPattern;

public class Vim {
    String location;

    public Vim(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "빔 프로젝트 온!");
    }

    public void off() {
        System.out.println(location + "빔 프로젝트 오프!");
    }
    public String getLocation() {
        return location;
    }
}

