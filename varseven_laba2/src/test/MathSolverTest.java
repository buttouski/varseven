package test;

import org.junit.Assert;
import org.junit.Test;

import varseven_laba2.MathSolver;

public class MathSolverTest {

    @Test
    public void testCalculateSquareRoot() {
        // Arrange
        int number = 16;
        double expectedSquareRoot = 4.0;
        
        // Act
        double actualSquareRoot = MathSolver.calculateSquareRoot(number);
        
        // Assert
        Assert.assertEquals(expectedSquareRoot, actualSquareRoot, 0.0001);
    }
}