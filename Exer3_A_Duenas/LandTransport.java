// LandTransport.java
public class LandTransport extends Transportation {
    String fuelType;
    int numberOfWheels;

    public LandTransport(String name, int capacity, double speed, String fuelType, int numberOfWheels) {
        super(name, capacity, speed);
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
