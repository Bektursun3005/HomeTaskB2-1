public final class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + getName());
        System.out.println("Author: " + author);
        System.out.println("Price: " + getPrice());
    }
}