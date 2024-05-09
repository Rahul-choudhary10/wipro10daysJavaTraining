package Task;
import java.util.*;
public class SliceArray {
	public static void main(String args[]) {
		/*Implement a method SliceArray that takes an array, a starting index, and an end index, 
		then returns a new array containing the elements from the start to the end index.*/
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting position for slicing : ");
		int start = sc.nextInt();
		System.out.print("Enter the ending position for slicing : ");
		int end = sc.nextInt();
		System.out.println("Array Before slicing");
		PrintArr(arr);
		System.out.println();
		System.out.println("Array After slicing");
		SliceArr(arr, start, end);
		sc.close();
	}
	
	
	public static void SliceArr(int arr[], int start, int end) {
		int n = end - start;
		int NewArr[] = new int[n+1];
		int k=0;
		for(int i=start-1; i<end; i++) {
			NewArr[k++] = arr[i];
		}
		
		PrintArr(NewArr);
	}
	
	public static void PrintArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
