package exercise4;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyingWithWings(), new Quack());
    }

    public MallardDuck(FlyingBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }
}