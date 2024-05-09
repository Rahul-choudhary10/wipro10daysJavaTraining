package Task;
public class SortingUsingBruteForce {
	public static void main(String args[]) {
		int arr[] = new int[] {10,5,15,7,23};
		System.out.print("Array Before sorted : ");
		PrintArr(arr);
		System.out.println();
		System.out.print("Array After sorted : ");
		SortArr(arr);	
	}
	public static void SortArr(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] =  arr[j];
					arr[j] = temp;
				}
			}
		}
		PrintArr(arr);
	}
	public static void PrintArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
