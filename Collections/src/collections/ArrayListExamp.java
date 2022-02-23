package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamp {

	public static void main(String[] args) {
		ArrayList<String> Students = new ArrayList<>();
		Students.add("Raghuram");
		Students.add("Ramesh");
		Students.add("Amith");
		Students.add("Arjun");
		
		System.out.println("The Students are : "+Students);
		
		Iterator itr = Students.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("\n"+itr.next());
		}

	}

}
