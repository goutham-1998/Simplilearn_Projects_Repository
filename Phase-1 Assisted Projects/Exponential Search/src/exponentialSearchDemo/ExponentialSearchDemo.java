package exponentialSearchDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearchDemo {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter element to search:");
			int x =sc.nextInt();
			
			int result = ExponentialSearchDemo.exponentialSearch(arr, x);
			if(result<0) {
				System.out.println("Element not found in array:");
			} else {
				System.out.println("Element found in array at index :"+result);
			}
		}
	}
	
	public static int exponentialSearch(int[] arr, int x) {
		int n = arr.length;
		if (arr[0] == x) {
			return 0;
		}
		
		
		int i = 1;
		while(i<n && arr[i] <=x) {
			i *=2;
		}
		
		return Arrays.binarySearch(arr, i/2, Math.min(i, n),x);
		
	}
}