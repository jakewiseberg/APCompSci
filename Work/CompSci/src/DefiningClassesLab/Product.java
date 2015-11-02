package DefiningClassesLab;

/**
 *
 * @author jacob.wiseberg
 */
public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    
    public void reducePrice(int reduce) {
        this.price-=reduce;
    }
    
    @Override
    public String toString() {
        return "This product is a " + name + " and it costs $" + price;
    }
    
}
