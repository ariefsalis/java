import java.util.*;

public class Array3 {
    public static void main (String[] args){
        Properties capitals = new Properties();
        Set states;
        String str;
        
        capitals.put("Itally","Rome");
        capitals.put("Luxembourg","Luxembourg");
        capitals.put("Denmark","Copenhagen");
        capitals.put("Finland","Helsinki");
        capitals.put("France","Paris");
        capitals.put("Slovakia","Bratislava");
        capitals.put("Slovenia","Ljubljana");
        capitals.put("Germany","Berlin");
        capitals.put("Greece","Athens");
        capitals.put("Ireland","Dublin");
        capitals.put("Netherlands","Amsterdam");
        capitals.put("Portugal","Lisbon");
        capitals.put("Spain","Madrid");
        capitals.put("Sweden","Stockholm");
        capitals.put("United Kingdom","London");
        capitals.put("Cyprus","Nicosia");
        capitals.put("Lithuania","Vilnius");
        capitals.put("Czech Republic","Prague");
        capitals.put("Estonia","Tallin");
        capitals.put("Hungary","Budapest");
        capitals.put("Latvia","Riga");
        capitals.put("Malta","Valetta");
        capitals.put("Austria","Vienna");
        capitals.put("Poland","Warsaw");
        
        states = capitals.keySet();
        Iterator itr = states.iterator();
        while (itr.hasNext()){
            str = (String) itr.next();
            System.out.println("The capital of "+ str + " is "+ capitals.getProperty(str)+".");
        }
        System.out.println();
        
        str = capitals.getProperty("Florida","Not Found");
        System.out.println("The capital of Florida is " + str + ".");
    }
}