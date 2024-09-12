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
       // Shape circle = new Circle("Red", 5.0);
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Yellow", 2,3.0);

        // Display details
        printShapeDetails(circle);
        printShapeDetails(rectangle);

        rectangle.setHeight(2);
        printShapeDetails(rectangle);
      ////testBranch test

        System.out.println("Test Commit 1");
    }
}
