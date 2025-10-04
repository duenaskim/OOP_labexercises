// TransportationTester.java
public class TransportationTester {
    public static void main(String[] args) {
        Truck truck = new Truck();
        SUV suv = new SUV();
        Tricycle tricycle = new Tricycle();
        Motorcycle motorcycle = new Motorcycle();
        Kariton kariton = new Kariton();
        Ship ship = new Ship();
        Submarine submarine = new Submarine();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        System.out.println("=== LAND TRANSPORT ===");
        truck.displayInfo();
        System.out.println();
        suv.displayInfo();
        System.out.println();
        tricycle.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
        System.out.println();
        kariton.displayInfo();

        System.out.println("\n=== WATER TRANSPORT ===");
        ship.displayInfo();
        System.out.println();
        submarine.displayInfo();

        System.out.println("\n=== AIR TRANSPORT ===");
        airplane.displayInfo();
        System.out.println();
        helicopter.displayInfo();
    }
}
