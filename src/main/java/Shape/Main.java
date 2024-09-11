package Shape;

public class Main {

    public static void printShapeDetails(Shape shape) {
        System.out.println("Shape Color: " + shape.getColor());
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        // Create objects
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display details
        printShapeDetails(circle);
        printShapeDetails(rectangle);
    }
}
