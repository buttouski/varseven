package test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import varseven_laba2.ArrayGenerator;


public class ArrayGeneratorTest {

    private static int[] randomArray;

    @BeforeClass
    public static void setUpBeforeClass() {
        randomArray = ArrayGenerator.generateArray();
        System.out.println("BeforeClass: Array generated");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        randomArray = null;
        System.out.println("AfterClass: Array cleared");
    }

    @Test
    public void testGenerateRandomArray() {
        assertNotNull(randomArray);
        assertEquals(11, randomArray.length);
    }
}
