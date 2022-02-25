package constructors;

class std
{
	int id;
	String name;
	std(int i,String n)
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println(id+" "+name);
		
	}
}

public class ConstructorsAsstProj1 {

	public static void main(String[] args) {
		
		std std1 = new std(1,"Ram");
		
		std std2 = new std(2,"ramesh");
		std1.display();
		std2.display();

	}

}
