package AdapterPattern.Adapter;

public class RuberDuck implements Duck{
    public void quack(){
        System.out.println("삑삑");
    }
    public void fly(){
        System.out.println("오리가 날개짓을 하며 나는 중!");
    }
}
