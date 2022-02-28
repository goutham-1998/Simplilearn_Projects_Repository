package linearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter an element to search = ");
		int x = sc.nextInt();
		
		int res = LinearSearch.linearsearch(arr,x);
		
		if(res<0)
		{
			System.out.println("Element Not present in the array");
		}
		else
		{
			System.out.println("Element found at index: "+res);
		}

	}



public static int linearsearch(int[] arr,int x)
{
	for (int i=0;i<arr.length;i++)
	{
		if (arr[i]==x)
		{
			return i;
		}
	}
	return -1;
}
}