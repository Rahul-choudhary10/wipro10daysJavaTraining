package Task;
import java.util.*;
public class TwoSumProblem {
	/*Given an array of integers, write a program that finds 
	  if there are two numbers that add up to a specific target. 
	 may assume that each input would have exactly one solution, 
	 and you may not use the same element twice. Optimize the solution for time complexity.
	 */
	 public static void main(String args[]) {
		 int arr[] = new int[] {2,14,28,30,42,41,1}; //1,2,14,28,30,41,42
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number whetever you want to add two specific elements in given array :");
		 int total = sc.nextInt();
		 SumArr(arr, total);
		 sc.close();	 }
	 
		public static void PrintArr(int arr[]) {
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
		}

	 
		public static void SumArr(int arr[], int total) {       
	        int start = 0;
	        int end = arr.length - 1;
	        Arrays.sort(arr); //1,2,14,28,30,41,42
	        PrintArr(arr);
	        while (start < end) {
	            int sum = arr[start] + arr[end]; //1+42 = 43 , 2+42 = 44, 14+42 = 56 , target = 16
	            if (sum == total) {
	                System.out.println("Two numbers found that add up to the total: " + arr[start] + " and " + arr[end]);
	                return;
	            } else if (sum < total) { //43<16 , 42<16
	                start++;
	            } else {
	                end--;
	            }
	        }
	        System.out.println("Number not found");
	        
	    }
}
