package exercise3;

public class MainCar {
    public static void main(String[] args) {
        Car bmw = new BMW();
        Car audi = new Audi();
        CarSpeed carSpeed = new CarSpeed(bmw);

        System.out.println(carSpeed.getMaxSpeed());
        carSpeed.showCarName();

        carSpeed.setCar(audi);

        System.out.println(carSpeed.getMaxSpeed());
        carSpeed.showCarName();
    }
}
