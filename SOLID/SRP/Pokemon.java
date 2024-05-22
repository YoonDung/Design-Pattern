package SOLID.SRP;
// SRP(단일 책임의 원칙) : 클래스나 모듈은 단 하나의 책임만 가져야 함) -> 클래스 분리
// 응집도 향상, 유지보수성 개선
public class Pokemon {
    private String name;
    private int level;
    private int hp;

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.hp = 100;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int level){
        this.hp = hp;
    }

}