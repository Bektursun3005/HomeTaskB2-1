public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public abstract void printInfo();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}