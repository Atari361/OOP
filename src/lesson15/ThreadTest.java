package lesson15;

/**
 * Created by dell on 7/10/2017.
 */
public class ThreadTest {

    public static void main(String[] args) {


        Thread thrMain = Thread.currentThread();
        PrintLettersThread thread = new PrintLettersThread("PrintLettersThread");
        thread.start();
        PrintLettersThread thread2 = new PrintLettersThread("\tPrintLettersThread");
        thread2.start();
        ThreadRun threadRun = new ThreadRun("\t\tRunnable");
        threadRun.run();
        Thread th4 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thrMain.setPriority(9);
        System.out.println("!!! " + thrMain.getPriority());

        // NEW
        // RUNNABLE(start())
        // BLOCKED
        // WAITING (sleep(3000))
        // TIMED WAITING
        // TERMINATED (interrupt())
    }
}
