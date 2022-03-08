package customExceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		int a=12,b=0,c;
		
		try
		{
			if(b == 0)
			{
				throw(new ArithmeticException("Not divisible by Zero"));
			}
		
		else
		{
			c=a/b;
			System.out.print("\nThe result is = "+c);
		}
		
		}
		catch(ArithmeticException e)
		{
			System.out.print("\nError : " + e.getMessage());
		}
	
	}
}


