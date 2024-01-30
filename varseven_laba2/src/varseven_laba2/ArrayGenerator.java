package varseven_laba2;

public class ArrayGenerator {
	public static int[] generateArray() {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomNumberGenerator.generateRandomNumber();
        }
        return array;
    }
}
