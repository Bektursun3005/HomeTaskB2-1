public class Phone extends Product {
    private String model;

    public Phone(String name, double price, String model) {
        super(name, price);
        this.model = model;
    }

    @Override
    public void printInfo() {
        System.out.println("Phone: " + getName());
        System.out.println("Model: " + model);
        System.out.println("Price: " + getPrice());
    }
}