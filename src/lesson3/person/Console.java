package lesson3.person;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 5/22/2017.
 */
public class Console {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        do {
            list.add(createPerson());

        } while (askQuestion());
        System.out.println();
    }

    private static boolean askQuestion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add new person? Y/N");
        String ans = scan.next();
        if (ans.equalsIgnoreCase("Y")){
            return true;
        } else {
            System.out.println("exit");
            scan.close();
            return false;
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
        return person;
    }
}
