import java.util.HashSet;
import java.util.Random;

public class Array15 {

    public static void main(String[] args) {
        Random rand = new Random();
        int e;
        int i;
        int g = 10;
        HashSet<Integer> randomNumbers = new HashSet<>();

        for (i = 0; i < g; i++) {
            e = rand.nextInt(20);
            randomNumbers.add(e);
            if (randomNumbers.size() <= 10) {
                if (randomNumbers.size() == 10) {
                    g = 10;
                }
                g++;
                randomNumbers.add(e);
            }
        }
        System.out.println("Ten Unique random numbers from 1 to 20 are  : " + randomNumbers);
    }
}

