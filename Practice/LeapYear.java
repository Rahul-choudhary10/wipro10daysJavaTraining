package Practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter the year to check leap year or not : ");
		int year = sc.nextInt();
		CheckLeap(year);
		sc.close();
		
	}
	
	public static void CheckLeap(int year) {
		boolean LeapYear = false;
		if(year%4==0 && year != 100 && year !=400) {
			LeapYear = true;
		}
		if(LeapYear) {
			System.out.println(year+" is the leap year");
		}
		else {
			System.out.println(year+" is not the leap year");
		}
	
	}
}
