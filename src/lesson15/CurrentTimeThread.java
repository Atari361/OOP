package lesson15;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by dell on 7/10/2017.
 */
public class CurrentTimeThread extends Thread{
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            Date date = new Date(System.currentTimeMillis());
            System.out.println(date);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
