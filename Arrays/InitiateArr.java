package Arrays;

public class InitiateArr {
	public static void main(String args[]) {
		int arr[] = new int[5];
		arr[0] = 20;
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 45;
		PrintArr(arr);
	}
	
	public static void PrintArr(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
