package SOLID.OCP;

public class Charizard extends Pokemon{
    public Charizard(String name, int level, int hp) {
        super(name, level, hp); //상속받은 클래스의 필드 초기화
        System.out.println("리자몽~ 파월파월!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 불을 내뿜으며 공격을 합니다!");
    }

    @Override
    public void evovle() {
        hp = hp + 30;
        level++;
        System.out.println(getName() + "이(가) 레벨 " + level + "으로 Up! \n체력은 " + hp + "로 증가!" );

    }
}