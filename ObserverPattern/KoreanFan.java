package ObserverPattern;

public class KoreanFan implements Fan{
    private String name;
    private int value;
    private Talent singer;

    public KoreanFan(String name, Singer singer){
        this.name = name;
        this.singer = singer;
        singer.addFan(this);
    }

    public void update(){ // pull 인자 삭제
        // this.value = value;
        this.value = singer.getPrice(); // pull
        System.out.println(name + "님 버블앱 구독 가격은 " + value + "원으로 변경되었습니다");
    }
}
