package arrayRotate;

import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Before Rotation: ");
		ArrayRotate.printArray(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter k:");
		int k = sc.nextInt();
		int[] result = ArrayRotate.rotate(arr, k);
		ArrayRotate.printArray(result);
		
		}
	
	
	public static int[] rotate(int[] arr,int k)
	{
		int n = arr.length;
		int[] temp = new int[n];
		
		for(int i=0;i<n;i++)
		{
			temp[(i+k)%n] = arr[i];
		}
		return temp;
	}
	
		
		static void printArray(int[] arr)
		{
			for (int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+" ");
		}
			System.out.println("");

	}

}
