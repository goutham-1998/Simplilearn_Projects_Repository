package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamp {

	public static void main(String[] args) {
		LinkedList<Integer> Nums = new LinkedList<>(); 
		
		Nums.add(7);
		Nums.add(8);
		Nums.add(3);
		Nums.add(4);
		Nums.add(1);
		
System.out.println("The numbers in the list are : "+Nums);

Iterator itr = Nums.iterator();

while(itr.hasNext())
{
	
	System.out.println("\n"+itr.next());
}
	}

}
