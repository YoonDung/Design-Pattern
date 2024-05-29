package AdapterPattern.Adapter;

public class SwanAdapter implements Duck{
    // Duck 객체 대신 Swan 객체를 사용해야하는 상황
    Swan swan;

    public SwanAdapter(Swan swan){
        this.swan = swan;
    }

    public void quack(){
        swan.quack();
    }

    public void fly() {
        swan.fly();
    }
}
