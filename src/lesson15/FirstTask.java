package lesson15;

/**
 * Created by dell on 7/10/2017.
 */
public class FirstTask {
    public static void main(String[] args) {

        PrintLettersThread th1 = new PrintLettersThread("A");
        PrintLettersThread th2 = new PrintLettersThread("\tB");
        PrintLettersThread th3 = new PrintLettersThread("\t\tC");

        th1.start();
        th2.start();
        boolean flag = true;
        while (th3.getState() != Thread.State.TERMINATED && flag){
            if(th1.getState() == Thread.State.TERMINATED &&
                    th2.getState() == Thread.State.TERMINATED) {
                th3.start();
                flag = false;
            }
        }
    }
}
