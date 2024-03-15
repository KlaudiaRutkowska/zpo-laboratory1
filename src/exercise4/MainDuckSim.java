package exercise4;

import java.util.ArrayList;

public class MainDuckSim {


    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck(new FlyingWithWings(), new Quack()));
        ducks.add(new RubberDuck(new FlyingNoWay(), new Squeak()));
        ducks.add(new ModelDuck(new FlyingNoWay(), new QuackNoWay()));

        for (Duck duck:ducks) {
            duck.performFly();
            duck.performQuack();
        }

        ducks.get(1).setFlyBehaviour(new FlyingBehaviour() {
            @Override
            public void fly() {
                System.out.println("Duck is flying with jetpack");
            }
        });

        ducks.get(1).performFly();
    }
}