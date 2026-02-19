package TestingQuestions;

// Question 6.4 - Find most expensive book
class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}

public class Question6_4 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java Programming", "John Smith", 45.99);
        books[1] = new Book("Data Structures", "Jane Doe", 62.50);
        books[2] = new Book("Algorithms", "Bob Johnson", 38.75);
        
        Book mostExpensive = books[0];
        for (Book book : books) {
            if (book.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = book;
            }
        }
        
        System.out.println("Most Expensive Book:");
        System.out.println("Title: " + mostExpensive.getTitle());
        System.out.println("Author: " + mostExpensive.getAuthor());
        System.out.println("Price: $" + mostExpensive.getPrice());
    }
}
