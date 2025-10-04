// Transportation.java
public class Transportation {
    String name;
    int capacity;
    double speed;

    public Transportation(String name, int capacity, double speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Speed: " + speed + " km/h");
    }
}
