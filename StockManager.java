import java.util.ArrayList;

public class StockManager {
    private ArrayList<Product> products;

    public StockManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (findProduct(product.getID()) == null) {
            products.add(product);
        } else {
            System.out.println("Product with this ID already exists.");
        }
    }

    public void printProductDetails() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product findProduct(int id) {
        for (Product p : products) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }

    public Product findProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public int numberInStock(int id) {
        Product p = findProduct(id);
        if (p != null) {
            return p.getQuantity();
        }
        return 0;
    }

    public void delivery(int id, int amount) {
        Product p = findProduct(id);
        if (p != null) {
            p.increaseQuantity(amount);
        }
    }

    public void printLowStock(int threshold) {
        for (Product p : products) {
            if (p.getQuantity() < threshold) {
                System.out.println(p);
            }
        }
    }
}
