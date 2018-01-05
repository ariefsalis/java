
import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] temp = {78, 60, 62, 68, 71, 68, 73, 85, 66, 64, 76, 63, 75, 76, 73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73};
        
        int sum = 0;
        for(int a = 0; a < temp.length; a++){
            sum = sum + temp[a];
        }
        double average = sum / temp.length;
        
        System.out.println("Average is: " + average);
        System.out.println(Arrays.toString(getSevenLowest(temp)));
        System.out.println(Arrays.toString(getSevenHighest(temp)));
    }
    private static int[] getSevenLowest(int[] array) {
        int[] lowestValues = new int[7];
        Arrays.fill(lowestValues, Integer.MAX_VALUE);

        for(int n : array) {
            if(n < lowestValues[6]) {
                lowestValues[6] = n;
                Arrays.sort(lowestValues);
            }
        }
        return lowestValues;
    }
     private static int[] getSevenHighest(int[] array) {
        int[] HighestValues = new int[7];
        Arrays.fill(HighestValues, Integer.MAX_VALUE);

        for(int n : array) {
            if(n > HighestValues[6]) {
                HighestValues[6] = n;
                Arrays.sort(HighestValues);
            }
        }
        return HighestValues;
    }
    
}


    