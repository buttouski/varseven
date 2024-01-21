package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import java.util.Random;
public class MainSceneController {
	@FXML
    private Label trText;
	// Event Listener on Button.onAction
	@FXML
	public void btnOKClicked(ActionEvent event) {
		// Генерация случайных чисел
        int[] randomNumbers = generateRandomNumbers();
        StringBuilder randomNumberString = new StringBuilder("Случайные числа: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumberString.append(randomNumbers[i]);
            if (i != randomNumbers.length - 1) {
                randomNumberString.append(", ");
            }
        }
        trText.setText(randomNumberString.toString());

        // Создание массива из случайных чисел
        int[] array = randomNumbers.clone();
        StringBuilder arrayString = new StringBuilder("Массив: ");
        for (int i = 0; i < array.length; i++) {
            arrayString.append(array[i]);
            if (i != array.length - 1) {
                arrayString.append(", ");
            }
        }
        trText.setText(trText.getText() + "\n" + arrayString.toString());
        
        // Пузырьковая сортировка массива
        BubbleSort.bubbleSort(array);
        StringBuilder sortedArrayString = new StringBuilder("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            sortedArrayString.append(array[i]);
            if (i != array.length - 1) {
                sortedArrayString.append(", ");
            }
        }
        trText.setText(trText.getText() + "\n" + sortedArrayString.toString());
        
        // Вычитание наименьшего элемента из наибольшего
        int subtractResult = ArrayOperations.subtractMinMax(array);
        trText.setText(trText.getText() + "\nВычитание наименьшего элемента из наибольшего: " + subtractResult);
        
        // Нахождение квадратного корня из числа
        double squareRootResult = MathOperations.squareRoot(subtractResult);
        trText.setText(trText.getText() + "\nКвадратный корень из числа: " + squareRootResult);
		
	}
	 private int[] generateRandomNumbers() {
	        int[] randomNumbers = new int[11];
	        Random random = new Random();
	        for (int i = 0; i < randomNumbers.length; i++) {
	            randomNumbers[i] = random.nextInt(401) + 100;
	        }
	        return randomNumbers;
	    }
	 
	public class RandomNumberGenerator {
	    public static int generateRandomNumber() {
	        Random random = new Random();
	        return random.nextInt(401) + 100;
	    }
	}
	public class ArrayGenerator {
	    public static int[] generateRandomArray() {
	        int[] array = new int[11];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = RandomNumberGenerator.generateRandomNumber();
	        }
	        return array;
	    }
	}
	
	public class BubbleSort {
	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	}
	
	public class ArrayOperations {
	    public static int subtractMinMax(int[] array) {
	        int min = array[0];
	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max - min;
	    }
	}
	
	public class MathOperations {
	    public static double squareRoot(int number) {
	        return Math.sqrt(number);
	    }
	}
	
}
