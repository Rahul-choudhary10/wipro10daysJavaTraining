package Practice;
//import java.util.*;
/*Create a Shape class with a method area() and extend it with Circle and Rectangle classes overriding the area() 
method appropriately.*/

class Shape{
	public void area() {
		System.out.println("Area of the given shapes.....");
	}
}

class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
			this.radius = radius;
	}
	
	public void area() {
		double val =  Math.PI*radius*radius;
		System.out.print("area of circle : "+val);
	}
	
}


public class InheritanceProg {
	public static void main(String args[]){
		Circle c1 = new Circle(4);
		c1.area();
	}
}
