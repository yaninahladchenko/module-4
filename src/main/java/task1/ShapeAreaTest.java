package task1;

public class ShapeAreaTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle area is: " + rectangle.calculateArea());

        Square square = new Square(6);
        System.out.println("Square area is: " + square.calculateArea());

        Circle circle = new Circle(8);
        System.out.println("Circle area is: " + circle.calculateArea());
    }

}



