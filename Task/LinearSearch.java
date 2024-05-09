package Task;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {46,89,65,45,78,73};
		System.out.print("The given Array is: ");
		PrintArr(arr);
		System.out.println();
		System.out.print("Enter the element to find the position : ");
		int elem = sc.nextInt();
		System.out.print(elem+" on "+ (SearchElem(arr, elem)+1)+" position");
		sc.close();
	}
	
	public static int SearchElem(int arr[], int elem) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==elem) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void PrintArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
