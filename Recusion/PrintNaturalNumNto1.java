package Recusion;
import java.util.*;
public class PrintNaturalNumNto1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print all the natural number N to 1 ");
		System.out.print("Enter the value of n");
		int n = sc.nextInt();
		
		PrintNaturalNum(n);
		sc.close();
	}
	
	public static void PrintNaturalNum(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		PrintNaturalNum(n-1);
		
	}
}
