package lesson6;

/**
 * Created by dell on 5/30/2017.
 */
public abstract class AbstractA {

    public void printAbout(){
        System.out.println(getClass().getName());
    }
    public abstract void print();
}
