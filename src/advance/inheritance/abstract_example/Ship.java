package advance.inheritance.abstract_example;

public class Ship extends Vehicle {
    private String model;

    public Ship(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;

    }

    public int vehicleMaxSpeed() {
        return maxSpeed + 10;


    }
}


