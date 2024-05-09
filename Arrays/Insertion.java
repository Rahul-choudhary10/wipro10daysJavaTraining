package Arrays;
import java.util.*;
public class Insertion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {46,89,65,45,78,73};
		System.out.print("Enter the position where you want to insert the value : ");
		int pos = sc.nextInt();
		System.out.print("Enter the value what you want to insert at specific position : ");
		int val = sc.nextInt();
		Insertion(arr, pos, val);
		sc.close();
	}
	
	public static void Insertion(int arr[], int pos, int val) {
		int n = arr.length;
		for(int i=n-1; i>pos-1; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = val;
		PrintArr(arr);
	}
	
	public static void PrintArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
