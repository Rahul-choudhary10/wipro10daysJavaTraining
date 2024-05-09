package Practice;
import java.util.Scanner;
public class LargestNum {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value of first number : ");
		int num1 = Sc.nextInt();
		System.out.print("Enter the value of Second number : ");
		int num2 = Sc.nextInt();
		
		LargeNum(num1, num2);
		Sc.close();
	}
	
	public static void LargeNum(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1+" is the greatest number");
		}
		else {
			System.out.println(num2+" is the greatest number");
		}
	}

}
