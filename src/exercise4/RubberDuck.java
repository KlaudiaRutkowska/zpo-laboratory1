package exercise4;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyingNoWay(), new Squeak());
    }

    public RubberDuck(FlyingBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }
}
