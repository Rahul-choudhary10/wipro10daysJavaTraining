package sorting;

public class bubbleSortOptimize {

	public static void main(String[] args) {
		int arr[] = new int[] {2, 6, 7, 14,1, 9};
		System.out.println("The given array is ");
		printArr(arr);
		sortArr(arr);
		System.out.println();
		System.out.println("The  array after sorting ");
		printArr(arr);
		

	}
	static void sortArr(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			boolean flag = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			
			if(!flag) {
				return;
			}
		}
	}
	
	static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
