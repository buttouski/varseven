package test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import varseven_laba2.BubbleSort;

import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {

    private static int[] unsortedArray;

    @BeforeClass
    public static void setUpBeforeClass() {
        unsortedArray = new int[]{5, 2, 8, 1, 9};
    }

    @Test
    public void testBubbleSort() {
        int[] expectedArray = new int[]{1, 2, 5, 8, 9};
        BubbleSort.bubbleSort(unsortedArray);
        assertArrayEquals(expectedArray, unsortedArray);
    }
}
