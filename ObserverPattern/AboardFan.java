package ObserverPattern;

public class AboardFan implements Fan {
    private String name;
    private int value;
    private Talent singer; // Aggregation (has-a) 약한 결합

    public AboardFan(String name, Talent singer) {
        this.name = name;
        this.singer = singer;
        singer.addFan(this);
    }

    public void update(){ // pull int value 인자 삭제
        // this.value = value;
        this.value = singer.getPrice(); // pull
        System.out.println("Mr/Mrs. " + name + "\nbubble app price has been change to " + value + " won.");
    }
}
