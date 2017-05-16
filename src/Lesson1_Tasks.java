import java.util.ArrayList;

/**
 * Created by pavlo.letskyi on 5/16/2017.
 */
public class Lesson1_Tasks {

    public static void main(String[] args) {

        // Task4
        registerAutoCorrect(" bla bla bla ");

        // Task3
        //mergeTwoArrays(new int[]{1,2,3}, new int[]{4,5,6} );

        // Task1
        //countWords("bla 123 ghf");

    }


    public static int countWords(String userString){

//        Ввести с консоли строку с символами и пробелами.
//        Посчитать количество слов в предложении.

//        userString = userString.trim();
//        String[] words = userString.split(" ");
//        System.out.println(words.length);

        return stringToListOfWords(userString).size();

    }

    public static int[] mergeTwoArrays(int[] firstArray, int[] secondArray){

//        Заданы два массива одинаковой длинны с любыми значениями
//        скопировать данные из первого массива во второй.

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : firstArray){
            list.add(val);
        }

        for (int val : secondArray){
            list.add(val);
        }

        int[] mergedArray = new int[list.size()];

        for (int i=0; i < list.size(); i++){
            mergedArray[i] = list.get(i);
        }

        return mergedArray;

    }

    public static String registerAutoCorrect(String userString){

//         Напишите программу, которая позволяет пользователю ввести в консоли строку,
//         переводит первый символ слов в верхний регистр и результат выводит в консоль

        userString = userString.trim(); // remove excess spaces
        ArrayList<String> words = stringToListOfWords(userString);

        String fixedWords = "";

        for (String word : words){
            String firstLetter = word.substring(0, 1);
            firstLetter = firstLetter.toUpperCase();
            String fixedWord = firstLetter + word.substring(1);
            fixedWords += " " + fixedWord;
        }

        System.out.println(fixedWords);

        return fixedWords.substring(1); // remove first space

    }

    public static ArrayList stringToListOfWords(String userString){
        String bufferString = userString;
        ArrayList<String> userWords = new ArrayList<>();

        for (int i = bufferString.indexOf(" "); bufferString.indexOf(" ") != -1 ; i = bufferString.indexOf(" ")){
            userWords.add(bufferString.substring(0, i));
            bufferString = bufferString.substring(i).trim();
        }
        userWords.add(bufferString); // add last word that left in

        return userWords;
    }
}
