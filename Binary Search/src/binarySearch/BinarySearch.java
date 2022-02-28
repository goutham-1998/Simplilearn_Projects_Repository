package binarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter element to search:");
			int x =sc.nextInt();
			
			int result = BinarySearch.binarySearch(arr, x);
			if(result<0) {
				System.out.println("Element not found in array:");
			} else {
				System.out.println("Element found in array at index :"+result);
			}
		}
	}
	
	public static int binarySearch(int[] arr, int x) {
		
		int start = 0;
		int length = arr.length;
		
		
		int mid = (start+length)/2;
		
		while(start <= length) {
			
			if(arr[mid] <x) {
				start=mid+1;
			} else if(arr[mid] == x) {
				System.out.println("Found solution");
				return mid;
				
			} else {
				length = mid -1;
			}
			
			mid = (start+length)/2;
		}
		return -1;
	}

}