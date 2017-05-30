package lesson6.human;

/**
 * Created by dell on 5/30/2017.
 */
public abstract class Human implements Humanable {

    String name;
    int weight;
    int sanity;

    public void aboutHuman(){
        System.out.println(
                 "Name: " + name + "\n" +
                 "Weight: " + weight + "\n" +
                 "Sanity: " + sanity + "\n"
        );
    }
}
