package lesson5.geometry;

/**
 * Created by dell on 5/29/2017.
 */
public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void about(){
        System.out.println("Square:\n\nSide = " + side);
    }

    @Override
    public void area(){
        System.out.println("Area = " + (side*side));
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter = " + (side*4));
    }

}
