package sorting;

public class selectionSort {
	public static void main(String args[]) {
		int arr[] = new int[] {3,6,2,7,1};
		System.out.println("Given array is : ");
		printArr(arr);
		System.out.println("sorted array is : ");
		sortArr(arr);
		printArr(arr);
	}
	
	static void sortArr(int arr[]) { //[3,6,2,7,1]
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int j = i+1;
			while(j<n) {
				if(arr[i]<arr[j]) {
					j++;
				}
				else {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
