package Practice;
import java.util.*;
public class SwapUsingThirdVar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the value of Number 2 : ");
		int num2 = sc.nextInt();
		Swapping swap = new Swapping();
		swap.Swap(num1, num2);
		sc.close();
	}
	
}

class Swapping{
	public void Swap(int num1, int num2)
	{
		System.out.println("Before swapping ");
		System.out.println("number 1 = "+num1+ " Number 2 = "+num2);
		int temp = num1;
		num1= num2;
		num2 = temp;
		System.out.println("After swapping ");
		System.out.println("number 1 = "+num1+ " Number 2 = "+num2);
		
	}
	

}
