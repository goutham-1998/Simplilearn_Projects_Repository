package calci;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,choice;
        float result=0;
       
        Scanner s=new Scanner(System.in);
         
        System.out.print("Enter first number: ");
        a=s.nextInt();
        System.out.print("Enter second number: ");
        b=s.nextInt();
        System.out.print("\n1: Addition.\n2: Subtraction.");
        System.out.print("\n3: Multiplication.\n4: Divide.");
        System.out.print("\n5: Remainder.\n6: Exit.");
         
        System.out.print("\nEnter your choice: ");
        choice=s.nextInt();
         
        switch(choice)
        {
            case 1:
                result=(a+b); 
                break;
            case 2:  
                result=(a-b); 
                break;
            case 3:
                result=(a*b); 
                break;
            case 4:
                result=(float)((float)a/(float)b); 
                break;
            case 5:
                result=(a%b); 
                break;
            case 6:
            	System.out.println("Calci exited");
            default:
                System.out.println("Please choose the correct operator!!!\n");
                return;
        }
        if(choice>=1 && choice<=5)
           System.out.println("Result is: " + result);
         

	}

}
