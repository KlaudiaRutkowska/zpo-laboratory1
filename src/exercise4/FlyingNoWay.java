package exercise4;

public class FlyingNoWay implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Duck is not flying.");
    }
}