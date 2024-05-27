package SingletonPattern.Enum;

public enum ChocolateBoiler {
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;

//    private ChocolateBoiler() {
//        empty = true;
//        boiled = false;
//    } // enum은 열거형으로 자동으로 private (매개변수 등 코드변형X)

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 보일러가 비어있을 때만 우유와 초콜릿을 혼합한 재료를 넣음
            // 원료를 가득 채우고나면 empty와 boiled를 false로 설정
            System.out.println("우유+초콜릿 재료 투입!");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // 보일러가 가득 차 있고 다 끓여진 상태에서만 보일러에 들어있는 재료를 다음 단계로 넘김
            empty = true;
            // 보일러를 다 비우고 나면 empty를 다시 true로 설정
            System.out.println("보일러 비우기!");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 보일러가 가득 차 있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓임
            boiled = true;
            // 재료를 다 끓이면 boiled를 true로 설정
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