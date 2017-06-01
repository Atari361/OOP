package lesson6_homework.students;

import lesson6.human.Student;

import java.util.Scanner;

/**
 * Created by pavlo.letskyi on 5/31/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean closeAppFlag = true;

        StudentsGroup group = new StudentsGroup();

        do {
            System.out.println("\nEnter the number of action:\n" +
                    "1. ADD new student\n" +
                    "2. REMOVE student\n" +
                    "3. CHECK if student is already in group\n" +
                    "4. PRINT students of the group\n" +
                    "5. Closed app\n");

            if (scanner.hasNextInt()){
                int actionNumber = scanner.nextInt();
                switch (actionNumber) {
                    case 1: {
                        group.addStudent();
                        break;
                    } case 2: {
                        group.removeStudent();
                        break;
                    } case 3: {
                        group.searchStudent();
                        break;
                    } case 4: {
                        group.printGroup();
                        break;
                    }case 5: {
                        closeAppFlag = false;
                        break;
                    } default:{
                        System.out.println("Unknown action number!");
                    }
                }

            } else {
                System.out.println("ACTION FAILED! Please enter valid action number!");
                scanner.next();
            }
        } while (closeAppFlag);

        scanner.close();
        System.out.println("APP Closed.");}
    }
