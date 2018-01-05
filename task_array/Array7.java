import java.util.*;

public class Array7 {
   public static void main(String args[]) {

	  ArrayList<String> obj = new ArrayList<String>();

	  obj.add("1");
	  obj.add("2");
	  obj.add("3");
	  obj.add("4");
	  obj.add("5");

	  System.out.println("Original :" + obj);

	  obj.add(3, "$");

	  System.out.println("After insert \"$\" : " + obj);
   }
}