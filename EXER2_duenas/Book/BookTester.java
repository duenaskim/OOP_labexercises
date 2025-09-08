public class BookTester {
    public static void main(String[] args) {
        // Using parameterized constructor with specific details
        Book b1 = new Book("1984", "George Orwell", 1949, "Dystopian", 12.99);

        // Using no-argument constructor (default values)
        Book b2 = new Book();

        // Display information for both books
        b1.displayInfo();
        b2.displayInfo();
    }
}
