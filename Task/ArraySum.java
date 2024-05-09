package Task;

public class ArraySum {
	public static void main(String args[]) {
		int arr[] = new int[] {1,2,3,4,5,6,7};
		int i=0;
		int sum = ArrSum(arr, i);
        System.out.println("Sum of array elements: " + sum);
	}

	static int ArrSum(int arr[], int i) {
		int n = arr.length;
		if(i>=n) {
			return 0;
		}
		else {
			int num1= arr[i];
			int num2= ArrSum(arr,i+1);
			return num1+num2;
		}
	}
		
}
