import java.util.Arrays;

public class Array17 {
    public static void main (String[] args){
        int[] a = {0, 10, 2, 56, 10, 100 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        if (a[0] == 0){
            System.out.println(a[0+1]);
        }else{
            System.out.println(a[0]);
        }
    }
}