import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sortowanko {

    public static void main(String[] args) {
//        Product product1 = new Product("mleko", 2.5);
//        Product product2 = new Product("czekolada", 2.2);
//        int i = product1.compareTo(product2);
//        System.out.println(i);

        NameComparator nc = new NameComparator();
        List<Product> products = new ArrayList<>();
        products.add(new Product("mleko", 2.2));
        products.add(new Product("czekolada", 2.5));
        products.add(new Product("jogurt", 1.8));

        ProductComparator[] comparators = ProductComparator.values();
        System.out.println("Po czym posortować?");
        for (ProductComparator comparator : comparators) {
            System.out.println(comparator);
        }
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        ProductComparator productComparator = ProductComparator.valueOf(c);
        Collections.sort(products, productComparator.getComparator());
        System.out.println(products);
    }

}
