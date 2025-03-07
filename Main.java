// Main.java
import java.util.*;
class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the Rectangle: ");
		double length = Double.parseDouble(sc.nextLine());
		System.out.println("Enter width of Rectangle: ");
		double width = Double.parseDouble(sc.nextLine());
		
		Shape rectangle = new Rectangle(length, width);
		System.out.println("-------------------------");
		System.out.println("Area of Rectangle : "+rectangle.calculateArea());
		System.out.println("Perimeter of Rectangle : "+rectangle.calculatePerimeter());
		System.out.println("Sides of Rectangle: "+rectangle.getNumSides());
		System.out.println("----------------------");
		
		System.out.println("Enter radius of the Circle: ");
		double radius = Double.parseDouble(sc.nextLine());
		Shape circle = new Circle(radius);
		System.out.println("-------------------------");
		System.out.println("Area of circle : "+circle.calculateArea());
		System.out.println("Circumference of circle : "+circle.calculatePerimeter());
		System.out.println("Sides of circle: "+circle.getNumSides());
		System.out.println("----------------------");

	}
}