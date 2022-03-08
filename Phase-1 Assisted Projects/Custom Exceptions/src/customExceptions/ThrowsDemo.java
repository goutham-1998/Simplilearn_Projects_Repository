package customExceptions;

public class ThrowsDemo {
	
	void Division() throws ArithmeticException
	{
		int a=12,b=0,c;
		c=a/b;
		System.out.print("The result is = "+c);
	}

	public static void main(String[] args) {
		
		ThrowsDemo td = new ThrowsDemo();
				
		try
		{
			td.Division();
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("\nError : "+ae.getMessage());
		}
		System.out.println("\n\tTHE END...");

	}

}
