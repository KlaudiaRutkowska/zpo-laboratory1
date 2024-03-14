package exercise3;

public class CarSpeed
{
    //it's a value of the Car passed to the constructor or setter
    private Car car;

    public CarSpeed(Car car)
    {
        this.car = car;
    }

    public void setCar(Car car)
    {
        this.car = car;
    }

    public int getMaxSpeed()
    {
        return car.getMaxSpeed();
    }

    public void showCarName()
    {
        System.out.println(car.getCarName());
    }
}