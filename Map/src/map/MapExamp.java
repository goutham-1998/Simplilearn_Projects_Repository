package map;

import java.util.HashMap;
import java.util.Map;

public class MapExamp {

	public static void main(String[] args) {
		HashMap<Integer,String> res = new HashMap<Integer,String>();
		res.put(11, "Ram");
		res.put(12, "Aman");
		res.put(13, "Raghu");
		
		for(Map.Entry m:res.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }

	}

}
