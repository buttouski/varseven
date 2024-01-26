package test;

import static org.junit.Assert.*;

import java.util.Random;
import org.junit.Test;



public class SubTest {

	@Test
    public void test() {
        int[] randomNumbers = generateRandomNumbers();
        for (int number : randomNumbers) {
            assertTrue(number >= 100 && number <= 500);
        }
    }

    private int[] generateRandomNumbers() {
        int[] randomNumbers = new int[11];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(401) + 100;
        }
        return randomNumbers;
    }

}

