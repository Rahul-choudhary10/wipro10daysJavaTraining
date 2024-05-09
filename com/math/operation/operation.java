package com.math.operation;
import java.util.*;
public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		
		sc.close();
		
		division d = new division();
		d.div(a, b);
		addition sum = new addition();
		sum.add(a, b);
		multiplication mul = new multiplication();
		mul.multiple(a, b);
		subtraction sub = new subtraction();
		sub.sub(a, b);
	
	}

}
