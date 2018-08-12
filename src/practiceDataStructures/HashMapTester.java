package practiceDataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapTester {

	public static void main(String[] args) {
	      Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");

	      System.out.println();
	      System.out.println(" Map Elements");
	      System.out.println("\t" + m1);
	      System.out.println(" key set : " +m1.keySet());
	      System.out.println(" entry set : " + m1.entrySet());
	      System.out.println(" Values : " +m1.values()); 
	      
	   }
	
}
