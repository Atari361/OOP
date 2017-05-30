package lesson5.geometry;

/**
 * Created by dell on 5/29/2017.
 */
public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public void about(){
        System.out.println("Rectangle:\n\nSide A = " + sideA + "\nSide B = " + sideB);
    }

    @Override
    public void area(){
        System.out.println("Area = " + (sideA*sideB));
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter = " + (sideA + sideB));
    }
}
