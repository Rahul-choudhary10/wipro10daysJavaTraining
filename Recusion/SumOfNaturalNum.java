package Recusion;
import java.util.*;
public class SumOfNaturalNum {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to print natural number");
		int n = sc.nextInt();
		PrintIncreasing(n);
		sc.close();
	}
	
	public static void PrintIncreasing(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		PrintIncreasing(n-1);
		System.out.println(n);
	}

}
