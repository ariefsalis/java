import java.util.Hashtable;
import java.util.Enumeration;

public class Array8 {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Sophia","31");
   hashtable.put("Jacob","41");
   hashtable.put("William","39");
   hashtable.put("Ramesh","40");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}
