package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExamp {

	public static void main(String[] args) {
		 Hashtable<Integer,String> hte=new Hashtable<Integer,String>();  
	      
	      hte.put(10,"Ram");  
	      hte.put(11,"Aman");  
	      hte.put(12,"Raghu");  
	      hte.put(13,"Jessie");  

	      System.out.println("The HashTable Consists of : ");  
	      for(Map.Entry n:hte.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	}
	}

