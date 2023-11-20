// Abstract class Shape
abstract class Shape {
    // Abstract method
    abstract void numberOfSides();
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

// Concrete subclass Triangle
class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

// Concrete subclass Hexagon
class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

// Main class to test the program
public class ShapesExample {
    public static void main(String[] args) {
        // Creating objects of each shape
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        // Calling the numberOfSides method for each shape
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
