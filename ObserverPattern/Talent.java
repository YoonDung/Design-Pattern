package ObserverPattern;

public interface Talent {
    public void addFan(Fan f);
    public void deleteFan(Fan f);
    public void notifyFan();
    int getPrice();
}
