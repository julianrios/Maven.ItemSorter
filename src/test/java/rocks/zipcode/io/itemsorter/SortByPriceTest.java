package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void sortByPriceTest1() {
        // Given
        Item item3 = new Item(0L, "Apple", 1.0);
        Item item2 = new Item(1L, "Banana", 1.5);
        Item item1 = new Item(2L, "Cherry", 2.0);

        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};

        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        PriceComparator comparator = new PriceComparator();

        // When
        Item[] actual = itemSorter.sort(comparator);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByPriceTest2() {
        // Given
        Item item3 = new Item(0L, "Apple", 3.0);
        Item item2 = new Item(1L, "Banana", 2.0);
        Item item1 = new Item(2L, "Cherry", 1.0);

        Item[] itemsToSort = {item2, item3, item1};
        Item[] expected = {item1, item2, item3};

        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        PriceComparator comparator = new PriceComparator();

        // When
        Item[] actual = itemSorter.sort(comparator);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortByPriceTest3() {
        // Given
        Item item3 = new Item(0L, "Apple", 1.3);
        Item item2 = new Item(1L, "Banana", 0.5);
        Item item1 = new Item(2L, "Cherry", 2.3);

        Item[] itemsToSort = {item3, item1, item2};
        Item[] expected = {item2, item3, item1};

        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        PriceComparator comparator = new PriceComparator();

        // When
        Item[] actual = itemSorter.sort(comparator);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }
}
