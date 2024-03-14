package exercise4;

public abstract class Duck {

    FlyingBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public Duck(FlyingBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("The duck is swimming!");
    }

    public void setFlyBehaviour(FlyingBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}
