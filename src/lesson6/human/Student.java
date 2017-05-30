package lesson6.human;

/**
 * Created by dell on 5/30/2017.
 */
public class Student extends Human {

    String university = "KPI";

    @Override
    public void beath() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void poop() {

    }

    @Override
    public void aboutHuman(){
        super.aboutHuman();
        System.out.println("University: " + university);
    }
}
