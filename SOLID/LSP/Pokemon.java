package SOLID.LSP;
// LSP(리스코프 치환의 원칙) : 하위 타입은 상위 타입을 대체 할 수 있어야 함(호환) -> 인터페이스 사용(다중상속 가능)
// 일관성 유지 -> 확장성, 다형성
class Pokemon {
    public void attack() {
        System.out.println("공격 실패!");
    }
}
class FirePokemon extends Pokemon{
    @Override
    public void attack() {
        System.out.println("불 속성 공격 성공!");
    }
}
class WaterPokemon extends Pokemon{
    @Override
    public void attack() {
        System.out.println("물 속성 공격 성공!");
    }
}
class ElectricPokemon extends Pokemon{
    @Override
    public void attack() {
        System.out.println("전기 속성 공격 성공!");
    }
}
class Trainer{
    public void atttackPokemon(Pokemon pokemon){
        pokemon.attack();
    }
}
