package SingletonPattern.Synchronized;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("초콜릿 보일러의 유일한 인스턴스를 생성중입니다.");
            // ChocolateBoiler 인스턴스가 생성되지 않았을 때 (uniqueInstance가 null일 때)
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("초콜릿 보일러의 인스턴스를 반환중입니다.");
        // 이미 선언되어 있는 인스턴스가 있어 기존 인스턴스 반환
        return uniqueInstance;
    }
    // 해결방법 1. Synchronized 사용
    // 한 메소드가 메소드 사용을 끝내기 전까지 다른 스레드가 실행되지 않음
    // 하지만 동기화가 필요한 시점은 메소드가 시작되는 때 뿐이므로
    // uniqueInstance 변수에 Singleton 인스턴스를 대입 후 메소드를 동기화 상태로 유지할 필요X => 불필요한 오버헤드 증가

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //보일러가 비어있을 때만 우유와 초콜릿을 혼합한 재료를 넣음
            // 원료를 가득 채우고나면 empty와 boiled를 false로 설정
        }
    }

        public void drain(){
            if (!isEmpty() && isBoiled()) {
                // 보일러가 가득 차 있고 다 끓여진 상태에서만 보일러에 들어있는 재료를 다음 단계로 넘김
                empty = true;
                // 보일러를 다 비우고 나면 empty를 다시 true로 설정
            }
        }

        public void boil() {
            if (!isEmpty() && !isBoiled()) {
                // 보일러가 가득 차 있고 아직 끓지 않은 상태에서만 초콜릿과 우유가 혼합된 재료를 끓임
                boiled = true;
                // 재료를 다 끓이면 boiled를 true로 설정
            }
        }

        public boolean isEmpty() {
            return empty;
        }

        public boolean isBoiled() {
            return boiled;
        }
    }
