package SingletonPattern.dcl;


public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;
    // volatile 키워드 => 멀티스레딩을 쓰더라도 uniqueInstancee 변수가 Singleton 인스턴스로 초기화 되는 과정이 올바르게 진행
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            // unique Instance가 null이면 (인스턴스가 없을 경우)
            synchronized (ChocolateBoiler.class) {
                // ChocolateBoiler 클래스의 락을 얻음 (동기화)
                if (uniqueInstance == null) {
                    // 인스턴스가 없는지 다시 한 번 확인 (다른 스레드가 이미 인스턴스를 생성한 후 현재 스레드가 다시 락을 얻어들어오는 것을 방지)
                    System.out.println("초콜릿 보일러의 유일한 인스턴스를 생성중입니다.");
                    uniqueInstance = new ChocolateBoiler();
                    // 인스턴스를 생성하여 uniqueInstance에 할당
                }
            }
        }
        System.out.println("초콜릿 보일러의 인스턴스를 반환중입니다.");
        return uniqueInstance;
        // 이미 생성된 인스턴스를 반환하거나 인스턴스가 없는경우 새로운 인스턴스 생성 후 반환
    }
    // 해결방법 3. DCL 사용
    // 인스턴스가 생성되어 있는지 확인한 뒤 생성되지 않았을 때만 동기화
    // => 처음 인스턴스 생성할 때만 동기화하고 나중에는 동기화하지 않아도 되기 때문에 속도 개선 (그래도 느리긴함)

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
