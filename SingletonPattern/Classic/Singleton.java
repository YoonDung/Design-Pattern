package SingletonPattern.Classic;

public class Singleton {
    private static Singleton uniqueInstance;
    // 싱글턴 클래스의 하나뿐인 인스턴스를 저장하는 정적변수

    private Singleton() {}
    // 생성자 private -> 외부에서 인스턴스를 생성하지 못하게 막음

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
        // 해시코드 값 동일 (new 선언 시 단일객체가 아니기 때문에 해시코드 값 다름)
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
