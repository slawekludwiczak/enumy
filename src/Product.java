public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double pricce) {
        this.name = name;
        this.price = pricce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
