public class Product {
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void sellOne() {
        if (quantity > 0) {
            quantity--;
        }
    }

    public String toString() {
        return id + ": " + name + " stock: " + quantity;
    }
}
