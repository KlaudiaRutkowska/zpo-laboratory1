package exercise4;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new FlyingNoWay(), new QuackNoWay());
    }

    public ModelDuck(FlyingBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }
}
