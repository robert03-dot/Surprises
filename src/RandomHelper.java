import java.util.Random;

public class RandomHelper {
    private static Random randomElement = new Random();
    // TODO -> Returns a random number between [0, max]
    public static int getNewRandomInt(int max){
        int newRandom = randomElement.nextInt(max);
        return newRandom;
    }
}
//clasa folosita pentru a genera surprize random