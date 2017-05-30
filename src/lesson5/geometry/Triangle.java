package lesson5.geometry;

/**
 * Created by dell on 5/29/2017.
 */
public class Triangle extends Figure {
    private int katetA;
    private int katetB;

    public Triangle(int katetA, int katetB) {
        this.katetA = katetA;
        this.katetB = katetB;
    }

    @Override
    public void about(){
        System.out.println("Katet A = " + katetA + "\nKatetB = " + katetB);
    }

    @Override
    public void area(){
        System.out.println("Area = " + 0);
    }

    @Override
    public void perimeter(){
        System.out.println("Perometer = " + 0);
    }

    public void hype(){
        System.out.println("Hypo = " + 0);
    }

}
