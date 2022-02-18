package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Examples of Implicit Type Casting are :-");
		char a='A';
		System.out.println("Value of a : "+a);
		
		int b=a;
		System.out.println("Value of b : "+b);
		
		float c=a;
		System.out.println("Value of c : "+c);
		
		long d=a;
		System.out.println("Value of d : "+d);
		
		double e=a;
		System.out.println("Value of e : "+e);
		
		System.out.println("____________________________________________________________");
		
		System.out.println("Example of Explicit Type Casting are :-");
				
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);

	}

}
