package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamp {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();    
		tm.put(10,"Ram");    
		tm.put(11,"Aman");    
		tm.put(12,"Raghu");
		tm.put(13,"Jessie");
	      
	      System.out.println("The Treemap Consists of the following list : ");  
	      for(Map.Entry l:tm.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
