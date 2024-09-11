package Shape;

// Derived class
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        setRadius(radius);
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    @Override
    public double area() {
        return Math.PI * getRadius() * getRadius();
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }
}
