package caesarFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by letsk on 05/20/2017.
 */
public class Lesson2_caesarScript {

    static String alphabetLow = "abcdefghijklmnopqrstuvwxyz";
    static String alphabetUp = alphabetLow.toUpperCase();
    static String numbers = "0123456789";

    public static void main(String[] args) throws IOException {

        caesarEncrypt("src/caesarFiles/testText_notEncrypted.txt", 3);
        caesarDecrypt("src/caesarFiles/testText_encrypted.txt", 3);

    }

    private static void caesarDecrypt(String filePath, int shift) throws IOException {

        ArrayList<String> textList = getLinesListFromFile(filePath);

        FileWriter fw = new FileWriter("src/caesarFiles/decryptedText_" + System.currentTimeMillis() + ".txt");

        for (String line : textList){
            String decryptedString = "";

            for(int i = 0; i < line.length(); i++){
                String currentSymbol = line.substring(i, i+1);

                if (alphabetLow.contains(currentSymbol)){
                    decryptedString += decryptSymbol(currentSymbol, shift, alphabetLow);
                } else if (alphabetUp.contains(currentSymbol)) {
                    decryptedString += decryptSymbol(currentSymbol, shift, alphabetUp);
                } else if (numbers.contains(currentSymbol)) {
                    decryptedString += decryptSymbol(currentSymbol, shift, numbers);
                } else {
                    decryptedString += currentSymbol;
                }
            }
            fw.write(decryptedString + "\n");
        }
        fw.flush();
        fw.close();
    }

    private static String decryptSymbol(String currentSymbol, int shift, String alphabet) {
        String decryptedSymbol;
        int currentSymbolIndex = alphabet.indexOf(currentSymbol);
        do {
            try {
                decryptedSymbol = alphabet.substring(currentSymbolIndex - shift, currentSymbolIndex - shift + 1);
                break;
            } catch (StringIndexOutOfBoundsException e) {
                currentSymbolIndex = (currentSymbolIndex - (shift - 1)) + (alphabet.length()-1) + shift; // + shift at the end is needed for "try" code block
            }
        } while (true);
        return decryptedSymbol;
    }

    private static void caesarEncrypt(String filePath, int shift) throws IOException {

        ArrayList<String> textList = getLinesListFromFile(filePath);

        FileWriter fw = new FileWriter("src/caesarFiles/encryptedText_" + System.currentTimeMillis() + ".txt");

        for (String line : textList){
            String encryptedString = "";

            for(int i = 0; i < line.length(); i++){
                String currentSymbol = line.substring(i, i+1);

                if (alphabetLow.contains(currentSymbol)){
                    encryptedString += encryptSymbol(currentSymbol, shift, alphabetLow);
                } else if (alphabetUp.contains(currentSymbol)) {
                    encryptedString += encryptSymbol(currentSymbol, shift, alphabetUp);
                } else if (numbers.contains(currentSymbol)) {
                    encryptedString += encryptSymbol(currentSymbol, shift, numbers);
                } else {
                    encryptedString += currentSymbol;
                }
            }
            fw.write(encryptedString + "\n");
        }
        fw.flush();
        fw.close();
    }

    private static String encryptSymbol(String currentSymbol, int shift, String alphabet) {
        String encryptedSymbol;
        int currentSymbolIndex = alphabet.indexOf(currentSymbol);
        do {
            try {
                encryptedSymbol = alphabet.substring(currentSymbolIndex + shift, currentSymbolIndex + shift + 1);
                break;
            } catch (StringIndexOutOfBoundsException e) {
                currentSymbolIndex = (currentSymbolIndex + shift - 1) - (alphabet.length()-1) - shift; // -shift at the end is needed for "try" code block
            }
        } while (true);
        return encryptedSymbol;
    }

    private static ArrayList<String> getLinesListFromFile(String filePath) throws FileNotFoundException {
        FileReader fr = new FileReader(filePath);
        Scanner scanner = new Scanner(fr);
        ArrayList<String> textList = new ArrayList<>();
        while (scanner.hasNextLine()){
            textList.add(scanner.nextLine());
        }
        return textList;
    }

}
