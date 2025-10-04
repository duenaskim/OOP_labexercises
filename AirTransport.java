// AirTransport.java
public class AirTransport extends Transportation {
    double wingspan;
    String fuelType;

    public AirTransport(String name, int capacity, double speed, double wingspan, String fuelType) {
        super(name, capacity, speed);
        this.wingspan = wingspan;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Fuel Type: " + fuelType);
    }
}
