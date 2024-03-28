package exercise3;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Audi(new CarNameRS3(), new CarSpeedFast()));
        cars.add(new BMW(new CarNameM3(), new CarSpeedFast()));
        cars.add(new Peel(new CarNameP50(), new CarSpeedSlow()));

        for (Car car : cars) {
            car.showCarName();
            car.showCarSpeed();
            System.out.println("---");
        }
    }
}
