package exceptionHandling;

public class ExceptHandlExamp {

	public static void main(String[] args) {
		try
		{
			int[] a = {1,2,3};
			System.out.println(a[10]);
		}
		
		catch (Exception e)
		{
			System.out.println("An exception occured!!!,please check your Input and try again");
		}
		
		finally {
			
			System.out.println("This is the example for Exception Handling");
		}

	}

}
