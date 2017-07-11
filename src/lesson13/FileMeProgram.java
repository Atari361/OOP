package lesson13;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dell on 7/3/2017.
 */
public class FileMeProgram {

    public void runProgram() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("***********Welcome to FIle ME! ***********\n\n" +
                    "Available actions:\n" +
                    "1. Search the file\n" +
                    "2. Open the file\n" +
                    "3. Delete the file\n" +
                    "4. Close the program");
            int actionIndex = scan.nextInt();
            switch (actionIndex){
                case 1: {
                    System.out.println("SEARCH\nEnter the name of file:");
                    searchFile(scan.next());
                }case 2: {

                }
            }
        } while (scan.nextInt() != 4);
    }

    private ArrayList<String> searchFile(String searchedName) {

        File defaultDir = new File("D:" + File.separator + "Test");
        return null;
    }

    private ArrayList<String> lookForFileInDir(File dir, String searchedFile){
        ArrayList<String> results = new ArrayList<>();

        for (File currentFile : dir.listFiles()){
            if (currentFile.isFile() && currentFile.getName().equals(searchedFile)){
                results.add(dir.getAbsolutePath());
            } else if(currentFile.isDirectory()){
                lookForFileInDir(currentFile, searchedFile);
            }
        }
        return results;

    }

}
