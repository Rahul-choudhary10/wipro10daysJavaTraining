package Inheritance;
import java.util.*;
/*Create a Shape class with a method area() and extend it with Circle and Rectangle classes overriding the area() 
method appropriately.*/

class Shape{
	double area() {
		return 0;
	}
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		double area = Math.PI*radius*radius;
			return area;
		}
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	double area() {
		double area = length*breadth;
		return area;
	}
}
public class UsingInheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of Radius : ");
		double r = sc.nextDouble();
		
		System.out.print("Enter the value of Length of the rectangle : ");
		double len = sc.nextDouble();
		
		System.out.print("Enter the value of breadth of the rectangle : ");
		double bre = sc.nextDouble();
		
		Rectangle r1 = new Rectangle(len,bre);
		System.out.println("Area of Rectangle is : "+ r1.area());
		
		System.out.println();
		Circle c1 = new Circle(r);
		System.out.println("Area of circle is : "+ c1.area());
		
		sc.close();
	}

}
