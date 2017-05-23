package lesson3_homework;

/**
 * Created by pavlo.letskyi on 5/23/2017.
 */
public class Box {
    int size;
    static int number;

    public static Box getRandomBox(){
        number++;
        Box box = new Box();
        box.size = (int) Math.round(Math.random()*10);
        System.out.println("Box number: " + number + "\nBox size: " + box.size + "\n");
        return box;
    }
}
