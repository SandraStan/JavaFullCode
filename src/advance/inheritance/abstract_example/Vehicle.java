package advance.inheritance.abstract_example;

public abstract class Vehicle {
    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }
    public abstract int vehicleMaxSpeed();

}
