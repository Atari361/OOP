package lesson6.human;

/**
 * Created by dell on 5/30/2017.
 */
public interface Humanable {

    default void breath(){
        System.out.println("HUMAN BREATH");
    };
    default void run(){
        System.out.println("HUMAN RUN");
    };
    default void sleep(){
        System.out.println("HUMAN SLEEP");
    };



    /*
    1. Создайте интерфейс описывающий человека,
    на основании интерфейса реализуйте класс (создайте метод выводящий информацию о человеке)
    2. На его основе созданного класса человека,
    реализуйте класс студент (переопределите метод вывода информации)
     */


}
