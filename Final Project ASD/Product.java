public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("| ID: %-4d | %-20s | Rp %,.2f |", id, name, price);
    }
}
