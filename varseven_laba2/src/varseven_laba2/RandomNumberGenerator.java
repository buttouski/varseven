package varseven_laba2;
import java.util.Random;

public class RandomNumberGenerator {
	public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(401) + 100;
    }

}
