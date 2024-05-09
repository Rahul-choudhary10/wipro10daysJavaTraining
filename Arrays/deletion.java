package Arrays;

import java.util.Scanner;

public class deletion {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {46,89,65,45,78,73};
		System.out.print("Before deletion Array is : ");
		PrintArr(arr);
		System.out.println();
		System.out.print("Enter the position what you want to delete: ");
		int pos = sc.nextInt();
		System.out.print("After deletion Array is : ");
		DeleteElem(arr, pos);
		sc.close();
	}
	
	public static void DeleteElem(int arr[], int pos) {
		int n = arr.length;
		int NewArr[] = new int[n-1];
		int index = 0;
		for(int i = 0; i<n; i++) {
			  if (i != pos - 1) {
	                NewArr[index] = arr[i];
	                index++;
	            }
		}
		
	PrintArr(NewArr);
		
	}
	
	public static void PrintArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
