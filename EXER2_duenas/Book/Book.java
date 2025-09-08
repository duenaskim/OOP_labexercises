public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;

    // No-argument constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.publicationYear = 0;
        this.genre = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, int publicationYear, String genre, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
    }
    
    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publication Year: " + this.publicationYear);
        System.out.println("Genre: " + this.genre);
        System.out.println("Price: $" + this.price + "\n");
    }
}
    