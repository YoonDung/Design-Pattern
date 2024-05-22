package SOLID.OCP;
// OCP(개방 폐쇄의 원칙) : 확장에는 열려있고 변경에는 닫혀있어야 함 -> 추상화 클래스 분리
// 새로운 기능 추가,변경 시 기존 코드 수정하지않고 확장 가능
public abstract class Pokemon {
    private String name;
    protected int level;
    protected int hp;

    public Pokemon(String name, int level, int hp){
        this.name = name;
        this.level = level;
        this.hp = hp;
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

    public abstract void attack();
    public abstract void evovle();
}