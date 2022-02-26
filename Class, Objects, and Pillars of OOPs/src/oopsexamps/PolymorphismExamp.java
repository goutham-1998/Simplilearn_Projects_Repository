package oopsexamps;

public class PolymorphismExamp {
	
	public int PolymorphismExamp(int x,int y)
	{
		return (x*y);
	}
	
	public int PolymorphismExamp(int x,int y,int z)
	{
		return (x+y+z);
	}
	
	public double PolymorphismExamp(double x,double y)
	{
		return (x*y);
		
	}

	public static void main(String[] args) {
		
		PolymorphismExamp p = new PolymorphismExamp();
		System.out.println(p.PolymorphismExamp(10, 20)); 
        System.out.println(p.PolymorphismExamp(10, 20, 30)); 
        System.out.println(p.PolymorphismExamp(10.5, 20.5)); 

	}

}
