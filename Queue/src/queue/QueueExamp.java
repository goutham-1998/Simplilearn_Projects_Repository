package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamp {

	public static void main(String[] args) {
		Queue<String> emp = new LinkedList<>();
		
		emp.add("Ram");
		emp.add("Amar");
		emp.add("Melvin");
		emp.add("Goutham");
		System.out.println("Queue :"+emp);
		System.out.println("Head : "+emp.peek());
		emp.remove();
		System.out.println("After removing, Queue :"+emp);
		System.out.println("Size of Queue : "+emp.size());

	}

}
