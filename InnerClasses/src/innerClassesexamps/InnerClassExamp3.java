package innerClassesexamps;

abstract class AnonymousInnerClass 
{
	public abstract void display();
}
public class InnerClassExamp3 {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Hello World!!!");
	         }
	      };
	      i.display();
	   }
	}
