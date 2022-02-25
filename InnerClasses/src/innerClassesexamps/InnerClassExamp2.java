package innerClassesexamps;

public class InnerClassExamp2 {
	
	private String msg = "Hello World!!!";
	
	void display()
	{
		class InnerClass
		{
			void msg() {
				System.out.println(msg);
			}
		}
		InnerClass ic = new InnerClass();
		ic.msg();
	}

	public static void main(String[] args) {
		InnerClassExamp2 ice = new InnerClassExamp2();
		ice.display();

	}

}
