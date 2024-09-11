package Shape;

// Derived class
public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(String color, double width, double height) {
        super(color);
        setWidth(width);
        setHeight(height);
    }

    // Getters and Setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be positive.");
        }
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }
    @Override
    public double perimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
