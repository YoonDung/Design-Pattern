package SOLID.DIP;

// DIP(의존성 역전의 원칙) : 상위 모듈은 하위 모듈에 의존해서는 안되며 양쪽 모두 추상화에 의존해야 함
// 클래스가 클래스에 직접 의존하지않고 외부에서 객체를 주입받아 사용 -> 구체적 구현이 변경되더라도 코드 수정할 필요X
public class Trainer {
    private final Battleable battleable;

    public Trainer(Battleable battleable){
        this.battleable = battleable;
    }

    public void catchPokemon(){
        System.out.println("포켓몬 줍줍!");
    }

    public void battle(){
        battleable.attack();
    }
}

interface Battleable {
    void attack();
}

class Pokemon implements Battleable{
    public void attack() {
        System.out.println("공격!");
    }
}