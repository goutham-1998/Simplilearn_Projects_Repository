package customExceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		
		int a=12,b=0,c = 0;
		
		try
		{
			c=a/b;
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Error: "+ae.getMessage());
		}
		
		finally
		{
			System.out.println("\nThe result is : "+c);
		}

	}

}
