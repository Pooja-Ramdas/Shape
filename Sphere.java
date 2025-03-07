class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }

    public double calculatePerimeter() {
        return 0; // Spheres do not have a perimeter
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * dim_one * dim_one * dim_one;
    }
}
