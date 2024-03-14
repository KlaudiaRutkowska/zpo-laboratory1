package exercise4;

public class FlyingNoWay implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("exercise4.Duck is not flying.");
    }
}