// Truck.java
public class Truck extends LandTransport {
    double loadCapacity;

    public Truck() {
        super("Truck", 3, 100, "Diesel", 6);
        this.loadCapacity = 10000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
