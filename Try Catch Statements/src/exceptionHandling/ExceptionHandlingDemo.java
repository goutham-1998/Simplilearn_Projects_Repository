package exceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		int[] a = new int[3];
        try 
        {
            a[7] = 54;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds...."); 
        }
        finally 
        {
            System.out.println("The array is of size " + a.length);
        }
    }
}
