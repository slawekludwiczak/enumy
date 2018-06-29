import java.util.Comparator;

public enum ProductComparator {
    NAME(new NameComparator()),
    PRICE(new PriceComparator());

    private Comparator<Product> comparator;

    ProductComparator(Comparator<Product> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Product> getComparator() {
        return comparator;
    }
}
