import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
//        if(o1.getName().compareTo(o2.getName()) > 0)
//            return 1;
//        else if(o1.getName().compareTo(o2.getName()) < 0)
//            return -1;
//        return 0;
        return o1.getName().compareTo(o2.getName());
    }
}
