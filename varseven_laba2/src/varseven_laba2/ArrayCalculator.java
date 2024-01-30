package varseven_laba2;

public class ArrayCalculator {
	public static int calculateDifference(int[] array) {
	    int max = array[0];
	    int min = array[0];
	    
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > max) {
	            max = array[i];
	        }
	        if (array[i] < min) {
	            min = array[i];
	        }
	    }
	    int element = (max - min);
	    
	    return element;
	}
}
