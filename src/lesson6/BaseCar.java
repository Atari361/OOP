package lesson6;

/**
 * Created by dell on 5/30/2017.
 */
public interface BaseCar{

    void start();
    void stop();
    default void drive(){
        System.out.println("123");
    };



}
