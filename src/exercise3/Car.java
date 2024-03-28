package exercise3;

public abstract class Car {
    CarNameBehaviour carNameBehaviour;
    CarSpeedBehaviour carSpeedBehaviour;

    public Car(CarNameBehaviour carNameBehaviour, CarSpeedBehaviour carSpeedBehaviour)
    {
        this.carNameBehaviour = carNameBehaviour;
        this.carSpeedBehaviour = carSpeedBehaviour;
    }

    public void setCarSpeedBehaviour(CarSpeedBehaviour carSpeedBehaviour)
    {
        this.carSpeedBehaviour = carSpeedBehaviour;
    }

    public void setCarNameBehaviour(CarNameBehaviour carNameBehaviour)
    {
        this.carNameBehaviour = carNameBehaviour;
    }

    public void showCarSpeed()
    {
        System.out.println("This car max speed is: " + carSpeedBehaviour.getMaxSpeed());
    }

    public void showCarName()
    {
        System.out.println("This car name is: " + carNameBehaviour.getCarName());
    }
}
