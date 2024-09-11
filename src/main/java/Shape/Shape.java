package Shape;

// Base class
public abstract class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract double area();
    // Abstract method
    public abstract double perimeter();
}
