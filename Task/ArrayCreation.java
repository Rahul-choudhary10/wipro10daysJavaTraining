package Task;

public class ArrayCreation {
	/*Create a program that declares an array of integers, initializes it with 
	consecutive numbers, and prints the array in reverse order.*/
	public static void main(String args[]) {
		int arr[] = new int[]{1,3,4,5,6,};
		System.out.println("After Reversed array is :");
		//ReverseArr(arr);
		ReverseArrWithSwap(arr);
		//ReverseArrWithNewArr(arr);
	}

	public static void PrintArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void ReverseArr(int arr[]) {
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	
	}
	
	public static void ReverseArrWithSwap(int arr[]) {
		//int arr[] = new int[]{1,3,4,5,6,};
		int n=arr.length;
		int mid = n/2;
		for(int i=0; i<mid; i++) {
				int temp = arr[i];
				arr[i]=arr[n-i-1];
				arr[n-i-1]=temp;

			}
		PrintArr(arr);
	}
	
	public static void ReverseArrWithNewArr(int arr[]) {
		int n = arr.length;
		int j=0;
		int newArr[] = new int[n];
		for(int i=n-1; i>=0; i--) {
			newArr[j++] = arr[i];
		}
		
		PrintArr(newArr);
	}

}
