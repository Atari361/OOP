package lesson3_homework;

/**
 * Created by pavlo.letskyi on 5/23/2017.
 */
public class Plain {

    String state;

    public void up(){
        if (state == "UP") {
            System.out.println("ALREADY UP");
        } else {
            System.out.println("GOING UP");
            state = "UP";
        }
    }

    public void down(){
        if (state == "DOWN") {
            System.out.println("ALREADY DOWN");
        } else {
            System.out.println("GOING DOWN");
            state = "DOWN";
        }
    }

    public String printAboutMe(){
        return state;
    }

    public void doRandomAction(){
        int action = (int) Math.round(Math.random()*1);
        if (action == 0){
            down();
        } else if (action == 1) {
            up();
        }
    }

}
