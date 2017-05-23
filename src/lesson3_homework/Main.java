package lesson3_homework;

import java.util.ArrayList;

/**
 * Created by pavlo.letskyi on 5/23/2017.
 */
public class Main {

    public static void main(String[] args) {

        //Boxes
        //mainBox(100);

        //Plane
        mainPlain();
    }

    private static void mainPlain() {
        Plain plain = new Plain();
        for (int i=0; i < 10; i++){
            plain.doRandomAction();
        }
        System.out.println("DONE! Current state of plane is: " + plain.printAboutMe());
    }

    private static void mainBox(int totalBoxes) {
        ArrayList<Box> boxes = new ArrayList<>();
        while (Box.number != totalBoxes){
            boxes.add(Box.getRandomBox());
        }
        System.out.println("DONE! Total boxes:" + Box.number);
    }


}
