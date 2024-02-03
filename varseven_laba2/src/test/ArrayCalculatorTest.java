package test;

import org.junit.Test;

import junit.framework.Assert;
import varseven_laba2.ArrayCalculator;

import static org.junit.Assert.*;

public class ArrayCalculatorTest {

    @Test
    public void testCalculateDifference() {
        // Arrange
        int[] array = {1, 2, 3, 4, 5};
        int expectedDifference = 4;
        
        // Act
        int actualDifference = ArrayCalculator.calculateDifference(array);
        
        // Assert
        Assert.assertEquals(expectedDifference, actualDifference);
    }
}