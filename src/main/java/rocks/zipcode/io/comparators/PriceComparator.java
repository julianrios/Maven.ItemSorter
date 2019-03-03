package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    public int compare(Item item1, Item item2) {
//        return item1.getPrice().compareTo(item2.getPrice());
        return Double.compare(item1.getPrice(), item2.getPrice());
    }
}
