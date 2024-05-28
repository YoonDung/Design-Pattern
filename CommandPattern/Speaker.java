package CommandPattern;

public class Speaker {
    public static final int HIGH =100;
    public static final int MEDIUM = 50;
    public static final int LOW = 5;
    public static final int OFF = 0;
    String location;
    int volume;

    public Speaker(String location){
        this.location = location;
        volume = OFF;
    }

    public void high(){
        volume = HIGH;
        System.out.println(location + "스피커 볼륨 100%");
    }

    public void medium(){
        volume = MEDIUM;
        System.out.println(location + "스피커 볼륨 50%");
    }

    public void low(){
        volume = LOW;
        System.out.println(location + "스피커 볼륨 5%");
    }

    public void off() {
        volume = OFF;
        System.out.println(location + "스피커 오프!");
    }

    public int getVolume() {
        return volume;
    }
}
