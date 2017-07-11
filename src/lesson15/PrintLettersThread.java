package lesson15;

/**
 * Created by dell on 7/10/2017.
 */
public class PrintLettersThread extends Thread {

    private String name;

    public PrintLettersThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(name);
        }
    }
}
