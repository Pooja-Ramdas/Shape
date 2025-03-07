import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        System.out.println("Select a shape to calculate area and perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Sphere");
        System.out.println("5. Cylinder");
        System.out.println("6. Equilateral Pyramid");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                System.out.println("Surface Area: " + sphere.calculateArea());
                System.out.println("Volume: " + sphere.calculateVolume());
                return;
            case 5:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                System.out.println("Surface Area: " + cylinder.calculateArea());
                System.out.println("Volume: " + cylinder.calculateVolume());
                return;
            case 6:
                System.out.print("Enter the base side of the equilateral pyramid: ");
                double baseSide = scanner.nextDouble();
                System.out.print("Enter the height of the equilateral pyramid: ");
                double pyramidHeight = scanner.nextDouble();
                EquilateralPyramid pyramid = new EquilateralPyramid(baseSide, pyramidHeight);
                System.out.println("Surface Area: " + pyramid.calculateArea());
                System.out.println("Perimeter: " + pyramid.calculatePerimeter());
                System.out.println("Volume: " + pyramid.calculateVolume());
                return;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (shape != null) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }
}
