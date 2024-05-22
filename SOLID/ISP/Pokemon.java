package SOLID.ISP;

class Pikachu implements AttackablePokemon {
    // 피카츄는 날지도 수영하지도 않기 때문에 필요한 기능(Attackable)만 상속
    @Override
    public void attack() {
        System.out.println("100만 볼트 공격 성공!");
    }

    @Override
    public void defend() {
        System.out.println("방어 성공!");
    }
}