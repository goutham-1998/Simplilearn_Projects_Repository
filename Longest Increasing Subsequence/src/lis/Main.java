package lis;

import java.util.Scanner;

public class Main {

	
	    // Function to find the length of the longest increasing subsequence
	    public static int LIS(int[] arr, int i, int n, int prev)
	    {
	        // Base case: nothing is remaining
	        if (i == n) {
	            return 0;
	        }
	 
	        // case 1: exclude the current element and process the
	        // remaining elements
	        int excl = LIS(arr, i + 1, n, prev);
	 
	        // case 2: include the current element if it is greater
	        // than the previous element in LIS
	        int incl = 0;
	        if (arr[i] > prev) {
	            incl = 1 + LIS(arr, i + 1, n, arr[i]);
	        }
	 
	        // return the maximum of the above two choices
	        return Integer.max(incl, excl);
	    }
	 
	    public static void main(String[] args)
	    {
	        
	    	try (Scanner sc = new Scanner(System.in)) {
				int n,i;
				System.out.println("How many random numbers you want to enter: ");
				n = sc.nextInt();
				int a[] = new int[n];
				
				System.out.println("Enter your random numbers : ");
				for (i=0;i<n;i++)
				{
					a[i] = sc.nextInt();
				}
 
				System.out.print("The length of the LIS is "
				                + LIS(a, 0, n, Integer.MIN_VALUE));
			}
	    }
	}
