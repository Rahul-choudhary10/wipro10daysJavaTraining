package Task;
import java.util.*;
public class fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		System.out.println("Print first "+n+" fibonacci number ");
		for(int i=0; i<n; i++) {
			System.out.println(Fib(i));
		}
		sc.close();
	}

	static int Fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int prev = Fib(n-1);
		int prevPrev = Fib(n-2);
		
		int sum = prev+prevPrev;
		return sum;
		}
}
