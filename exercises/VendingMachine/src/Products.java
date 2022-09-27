public class Products {
    private String name;
    private double price;

    // Constructors
    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Products() {
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
