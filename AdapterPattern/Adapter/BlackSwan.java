package AdapterPattern.Adapter;

public class BlackSwan implements Swan{
    public void quack(){
        System.out.println("우아한 겉모습과 다른 울음소리..");
    }
    public void fly(){
        System.out.println("백조가 우아하게 날개짓하며 V자로 나는중!");
    }
}
