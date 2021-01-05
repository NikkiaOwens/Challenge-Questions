package TestSorting;

import Sorting.IntSort;
import org.junit.Test;

public class IntSortTest {

    IntSort intSort = new IntSort();

    @Test
    public void sortTest(){
        int[] input = {1,5,6,8,4};
        int[] expected = {1,4,5,6,8};
        System.out.println("input" + input);
        intSort.sort(input);

//        int [] actual = intSort.sort(input);

//        Assert.assertEquals(expected, actual);
    }
}
