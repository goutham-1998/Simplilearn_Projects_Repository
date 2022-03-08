package innerClassesexamps;

public class InnerClassExamp1 {
	
	private String msg = "Hello World!!!";
	
	class InnerClass
	{
		void hello() {
			System.out.println(msg+"\nI am doing great...");
			
		}
	}

	public static void main(String[] args) {
		
    InnerClassExamp1 eg = new InnerClassExamp1();
    InnerClassExamp1.InnerClass ic = eg.new InnerClass();
    ic.hello();
	}

}
