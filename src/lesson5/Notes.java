package lesson5;

import lesson5.geometry.Circle;
import lesson5.geometry.Rectangle;
import lesson5.geometry.Square;
import lesson5.geometry.Triangle;

/**
 * Created by dell on 5/29/2017.
 */
public class Notes {

    /*
    final - forbids the inheritance

     */
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 12);
        rectangle.about();
        rectangle.perimeter();
        rectangle.area();
        System.out.println("\n===================\n");
        Square square = new Square(5);
        square.about();
        square.area();
        square.perimeter();
        System.out.println("\n===================\n");
        Circle circle = new Circle(5);
        circle.about();
        circle.area();
        circle.perimeter();
        System.out.println("\n===================\n");
        Triangle triangle = new Triangle(1,2);
        triangle.about();
        triangle.area();
        triangle.perimeter();

    }

}
