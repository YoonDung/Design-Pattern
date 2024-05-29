package AdapterPattern.Adapter;

public class DuckAdapter implements Swan{
    // 백조 객체대신 오리 객체를 사용해야하는 상황
    Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
    }

    public void fly(){
        duck.fly();
    }
}
