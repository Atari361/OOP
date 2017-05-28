package lesson4_homework.calculator;

import java.lang.*;
import java.lang.Number;
import java.util.Scanner;

/**
 * Created by letsk on 05/29/2017.
 */
public class ConsoleCalc {

    static int numCounter = 1;

    public static void main(String[] args) {

        launchConsoleCalc();

    }

    public static void launchConsoleCalc(){
        Scanner scan = new Scanner(System.in);

        do {
            double num1 = getNumberFromConsole(scan);
            double num2 = getNumberFromConsole(scan);

            System.out.println("Enter number of operation:\n1. ADD\n2. SUBTRACT\n3. MULTIPLY\n4. DIVIDE");
            if (scan.hasNextInt()) {
                switch (scan.nextInt()) {
                    case 1:
                        System.out.println("Result: " + num1 + num2);
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + num1 * num2);
                        break;
                    case 4:
                        System.out.println("Result: " + num1 / num2);
                        break;
                }
                numCounter = 1;
            } else {
                System.out.println("ERROR: Please enter numeric value!");
            }

            System.out.println("Do another calculation? Y/N");
            if (scan.next().equalsIgnoreCase("Y")) {
                continue;
            }
            scan.close();
            break;

        } while (true);
    }

    public static double getNumberFromConsole(Scanner scan){
        do {
            System.out.println("Enter #" + numCounter + " number");
            if (scan.hasNextDouble()) {
                numCounter++;
                return scan.nextDouble();
            } else {
                System.out.println("ERROR: Please enter numeric value!");
            }
        } while (true);
    }


}
