package Assignment;
import java.util.Scanner;
public class task1 {
	public static void main(String args[]) {
		
		/*Write a detailed pseudocode for a simple program that takes a number as input, 
		calculates the square if it's even or the cube if it's odd, and then outputs the result. 
		Incorporate conditional and looping constructs.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to find odd or even : ");
		int n = sc.nextInt();
		
		CheckOddEven(n);
	}
	static void CheckOddEven(int n) {
		if(n%2==0) {
			System.out.println(n+" is a even number.");
			double sqrt = Math.pow(n, 2);
			System.out.println("Square root of "+n +" is "+sqrt);
		}
		else {
			System.out.println(n+" is a odd number.");
			double cube = Math.pow(n, 3);
			System.out.println("Square root of "+n +" is "+cube);
		}
	}
}
