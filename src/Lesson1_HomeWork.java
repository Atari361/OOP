import java.util.ArrayList;

/**
 * Created by pavlo.letskyi on 5/16/2017.
 */
public class Lesson1_HomeWork {

    public static void main(String[] args) {

        // Task4
        registerAutoCorrect(" bla bla bla ");

        // Task3
        mergeTwoArrays(new int[]{1,2,3}, new int[]{4,5,6} );

        // Task2
        removeRepeatedWords("bla dla bla fla");

        // Task1
        countWords("bla 123 ghf");

        // Task0
         swapBigSmallChars("abcxyz");

    }

    private static void swapBigSmallChars(String userString) {

        // Поменять местами самую большую и самую маленькою чар

        String bufferString = userString;
        char big = userString.charAt(0);
        char small = userString.charAt(0);

        for (int i=0; i<userString.length(); i++){
            if (big > userString.charAt(i)){
                big = userString.charAt(i);
            }
            if (small < userString.charAt(i)){
                small = userString.charAt(i);
            }
        }

        int indexOfBig = userString.indexOf(small);
        int indexOfSmall = userString.indexOf(big);

        bufferString = bufferString.substring(0, indexOfBig) + Character.toString(big) + bufferString.substring(indexOfBig+1);
        bufferString = bufferString.substring(0, indexOfSmall) + Character.toString(small) + bufferString.substring(indexOfSmall+1);

        System.out.println(userString);
        System.out.println(bufferString);
    }

    private static void removeRepeatedWords(String userString) {

        // Удалить из предложения слова которые повторяются.

        String uniqueWordsString = "";

        ArrayList<String> words = stringToListOfWords(userString);
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (String word : words){
            if (!uniqueWords.contains(word)){
             uniqueWords.add(word);
            }
        }

        for (String word : uniqueWords){
            uniqueWordsString += " " + word;
        }
        uniqueWordsString = uniqueWordsString.substring(1);
        System.out.println(uniqueWordsString);

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
