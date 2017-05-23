package lesson3.person;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 5/22/2017.
 */
public class Console {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        do {
            list.add(createPerson());
            System.out.println("Add new person? Y/N");
            String answer = scan.next();
            if (answer == "Y"){
                continue;
            } else {
                break;
            }
        } while (true);
        System.out.println();
    }

    private static void askQuestion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add new person? Y/N");
        String answer = scan.next();

        if (answer == "Y"){
            answer = scan.next();

        } else {
            System.out.println("exit");

        }
    }

    private static Person createPerson() {

        Person person = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name");
        person.name = scan.next();
        System.out.println("Enter Surname");
        person.surname = scan.next();
        System.out.println("Enter Age");
        do {
            if (scan.hasNextInt()){
                person.age = Integer.parseInt(scan.next());
                break;
            }
            System.out.println("ERROR! Please enter age again!");
            scan.next();
        } while (true);
        scan.close();
        return person;
    }
}
