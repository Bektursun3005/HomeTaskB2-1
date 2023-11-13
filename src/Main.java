public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("iPhone X", 999.99, "Apple");
        phone.printInfo();

        System.out.println();

        Laptop laptop = new Laptop("MacBook Air", 1299.99, "Apple");
        laptop.printInfo();

        System.out.println();

        Book book = new Book("War and Peace", 24.99, "Leo Tolstoy");
        book.printInfo();
    }
}