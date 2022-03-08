package collections;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class HashSetExamp {

	public static void main(String[] args) {
		LinkedHashSet<String> str = new LinkedHashSet<>();  
		
		str.add("Ram");
		str.add("Racheal");
		str.add("Yankee");
		str.add("Zebra");
		
		
System.out.println(str);

Iterator itr = str.iterator();
  
while (itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
