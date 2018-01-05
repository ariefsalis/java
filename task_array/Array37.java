import java.util.Arrays;
import java.util.stream.Collectors;

public class Array37 {
    public static void main (String[] args){
        String [] array = {"A","Cat","Wolf","Wolf","Wolf",};
        Arrays.stream(array).collect(Collectors.groupingBy(s -> s))
      .forEach((k, v) -> System.out.println(k+" "+v.size()));
    }
}