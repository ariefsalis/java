import java.util.Hashtable;
import java.util.Enumeration;
import java.util.*;


public class Array12{
	
	public static void main(String[] args){
	Enumeration country;
	String capital, upCapital;

	Hashtable<String, String> hashtable = new Hashtable<String, String>();
	
	hashtable.put("A","Blue");
	hashtable.put("B","Green");
	hashtable.put("c","Red");

	country = hashtable.keys();

		while(country.hasMoreElements()){
			capital = (String) country.nextElement();
			upCapital = capital.toUpperCase();
			System.out.println(upCapital + " is : " + hashtable.get(upCapital));
		}
	}
}