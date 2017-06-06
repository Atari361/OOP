import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 5/16/2017.
 */
public class Lesson1_Notes {

    public static void main(String [] args) throws Exception{

        int [] arr = {1,2,2};

        //equals for object/s; == for primitives

        Scanner scan = new Scanner(System.in);

        //scan.next() - to clean cache

        FileWriter fw = new FileWriter("file.txt"); // +true to re-write
        fw.write("str1");
        fw.write("str2");
        fw.write("str3");
        fw.flush();

        fw.close();

        FileReader fr = new FileReader("file.txt");
        Scanner scanner = new Scanner(fr);
        System.out.println(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();

        // for object/s link is copied to method

    }

}
