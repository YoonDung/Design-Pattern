package SOLID.OCP;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level, int hp){
        super(name, level, hp);
        System.out.println("피카츄~ 피카피카!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 100만 볼트 공격을 합니다!");
    }

    @Override
    public void evovle() {
        hp = hp + 60;
        level++;
        System.out.println(getName() + "이(가) 레벨 " + level + "으로 Up! \n체력은 " + hp + "로 증가!" );
    }
}