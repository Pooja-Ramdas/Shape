// Circle.java
import java.util.*;
class Circle extends Shape{
	public Circle(double radius) {
		super(radius, 0, 0, 1);		//helps call the parameterized constructor of Shape
	}
	
	public double calculateArea(){
		return Math.PI * Math.pow(dim_one, 2);
	}
	
	public double calculatePerimeter(){
		return 2 * Math.PI * dim_one;
	}
}