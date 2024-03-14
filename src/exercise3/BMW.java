package exercise3;

public class BMW implements Car {

    @Override
    public int getMaxSpeed() {
        return 250;
    }

    @Override
    public String getCarName() {
        return "BMW";
    }
}
