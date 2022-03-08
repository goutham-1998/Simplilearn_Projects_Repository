package threadsCreationexamp;

public class MyThread extends Thread {
	public void run()
 	{
  		System.out.println("Thread has been created.");
}
	public static void main(String[] args) {
		MyThread mt = new  MyThread();
  		mt.start();
 	}
}
