// WaterTransport.java
public class WaterTransport extends Transportation {
    String material;
    String propulsionType;

    public WaterTransport(String name, int capacity, double speed, String material, String propulsionType) {
        super(name, capacity, speed);
        this.material = material;
        this.propulsionType = propulsionType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Material: " + material);
        System.out.println("Propulsion Type: " + propulsionType);
    }
}
