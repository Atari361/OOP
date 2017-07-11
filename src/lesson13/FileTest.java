package lesson13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by dell on 7/3/2017.
 */
public class FileTest {
    public static void main(String[] args) {

        FileMeProgram fileMeProgram = new FileMeProgram();
        fileMeProgram.runProgram();

        /*
        File directory = new File("D:" + File.separator + "Test");
        File file = new File("D:" + File.separator + "Test", "file.txt");
        File file2 = new File(directory, "file.txt");
        directory.mkdir();

        file.getPath();
        file.getAbsoluteFile();
        file.lastModified();
        file.length();

        File dirs = new File(directory, "TEST" + File.separator +"1"+ File.separator +"lastTEST");

        dirs.mkdirs();


        System.out.println(directory.exists());
        System.out.println(directory.isDirectory()); //isFile()

        String[] files = directory.list();
        File[] files2 = directory.listFiles();

        for (File f : files2){
            if (!f.isHidden()){
                System.out.println(f.getName() + "\n" + f.getPath() + "\n" + f.getParent());
            }
        }

        if (file.exists() && file.isFile()){
            try {
                FileWriter fw = new FileWriter(file);
                fw.append("First try");
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (file.createNewFile()) {
                    FileWriter fw = new FileWriter(file);
                    fw.append("Second try");
                    fw.flush();
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
