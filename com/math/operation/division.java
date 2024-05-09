package com.math.operation;

public class division {
	public void div(int a, int b) {
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
