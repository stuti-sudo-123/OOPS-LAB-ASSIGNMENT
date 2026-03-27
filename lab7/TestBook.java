
class Book {
    int bookId;
    String title;
    String author;
    double price;
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
class Periodical extends Book {
    String period;
    Periodical(int bookId, String title, String author, double price, String period) {
        super(bookId, title, author, price); // calling parent constructor
        this.period = period;
    }
    void setPrice(double newPrice) {
        this.price = newPrice;
    }
    void setPeriod(String newPeriod) {
        this.period = newPeriod;
    }
    void displayPeriodical() {
        super.display();
        System.out.println("Period: " + period);
    }
}
public class TestBook {
    public static void main(String[] args) {
        Periodical p = new Periodical(101, "Science Today", "ABC Publications", 150.0, "Monthly");

        System.out.println("Original Details:");
        p.displayPeriodical();
        p.setPrice(180.0);
        p.setPeriod("Weekly");

        System.out.println("\nUpdated Details:");
        p.displayPeriodical();
    }
}