package ExceptionHandling;
import java.util.*;
public class ExceptionHandling {
	/*Write a program that attempts to divide by zero, 
	catches the ArithmeticException, and provides a custom error message.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArithmeticOper(a,b);
		sc.close();

	}
	
	static void ArithmeticOper(int a, int b) {
		int c;
			try {
				c = a/b;
				System.out.println("A division by B is = "+c);
			}
			catch(ArithmeticException e) {
				String messege = e.getMessage();
				System.out.println(messege);
				System.out.println("Please Enter non - zero number");
			
		}
	}

}
