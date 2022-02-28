package range;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter First Value = ");
		int l = sc.nextInt();
		
		System.out.println("Enter Second Value = ");
		int r = sc.nextInt();
		
		System.out.println("Result:"+Range.range(arr, l, r));
		
		
				
	}
	
	
	public static int range(int arr[],int l,int j)
	{
		int sum = 0;
		for (int i=l;i<=j;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	
	}
}
