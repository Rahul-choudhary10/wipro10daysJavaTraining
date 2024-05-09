package Arrays;
import java.util.*;
public class twoDimen {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of row : ");
		int row = sc.nextInt();
		System.out.print("Enter the value of col : ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Enter the value of Array");
		inputArr(arr, row, col);
		System.out.println("Enter the value of Array");
		printArr(arr,row,col);
		sc.close();
	}
	
	static int[][] inputArr(int arr[][], int row, int col) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		return arr;
	}
	
	static void printArr(int arr[][], int row, int col) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for finding the index : ");
		int x = sc.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][j]==x) {
					System.out.println(x+" is on the row = "+i+" column = "+j);
					break;
				}
			}
		}
	}
}
