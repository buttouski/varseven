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
	
	
	
}
