package lesson8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dell on 6/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        // try catch throw throws finally
        Exception ex = new Exception();
        System.err.println(ex.getMessage()); // prints in another thread
        try (Scanner scanner = new Scanner(System.in)){
            throw new IOException("Message");}
        catch (ArithmeticException | IOException e){
            e.printStackTrace();
        } finally {

        }
    }


}
