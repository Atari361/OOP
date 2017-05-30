package lesson5.geometry;

/**
 * Created by dell on 5/29/2017.
 */
public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void about(){
        System.out.println("Radius = " + radius);
    }

    @Override
    public void area(){
        System.out.println("Area = " + radius);
    }

    @Override
    public void perimeter(){
        System.out.println("Perometer = ");
    }


}
