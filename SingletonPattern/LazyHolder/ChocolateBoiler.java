package SingletonPattern.LazyHolder;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static class LazyHolder {
        private static final ChocolateBoiler INSTANCE = new ChocolateBoiler();
        // 인스턴스 필드를 `final`로 선언하여 초콜릿보일러의 인스턴스 초기화 => 항상 동일한 인스턴스 반환
    } //Lazy Holder 클래스 추가
    // 해결방법 4. LazyHolder
    // 싱글턴 인스턴스를 직접 참조하는 필드가 필요하지 않으며
    // 처음 getInstance() 메서드 호출될때마 로드되며, 그 이후로는 해당인스턴스 반환

    public static ChocolateBoiler getInstance() {
        System.out.println("인스턴스를 반환합니다.");
        return LazyHolder.INSTANCE;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("우유+초콜릿 재료 투입!");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("보일러 비우기!");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("우유+초콜릿 끓이기!");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
