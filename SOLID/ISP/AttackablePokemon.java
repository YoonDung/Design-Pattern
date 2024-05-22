package SOLID.ISP;

// ISP(인터페이스 분리의 원칙) : 자신이 사용하지 않는 인터페이스에 의존하지 않아야 함 -> 필요한 기능에 따라 인터페이스 분리 / 클라이언트에 필요한 최소한의 기능만 제공
// 결합도 낮아짐, 인터페이스 변경 영향 최소화
public interface AttackablePokemon {
    void attack();

    void defend();
}
