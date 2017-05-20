import java.util.Arrays;

/**
 * Created by dell on 5/16/2017.
 */
public class Lesson2_Notes {

    public static int iter;
    public static void main(String[] args) {

        int[] array = getArray(10);
        int[] arrayCopy = getArrayCopy(array);
        System.out.println(Arrays.toString(arrayCopy));
        //stupidSort(arrayCopy);
//        bubbleSort(arrayCopy);
//        shakeSort(arrayCopy);
        selectionSort(arrayCopy);
        System.out.println(Arrays.toString(arrayCopy));
    }

    private static void selectionSort(int[] arrayCopy) {

        int min =0;
        int max =0;
        int minIndex =0;
        int maxIndex =0;
        for (int i=0; i<arrayCopy.length-1; i++){
                if (max < arrayCopy[i]){
                    maxIndex = i;
                    max = arrayCopy[i];
                }
        }

    }

    private static int[] getArrayCopy(int[] array) {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0,copy,0,copy.length);
        return copy;
    }

    private static int[] getArray(int arrSize) {

        int [] arr = new int [arrSize];
        for (int i = 0; i < arrSize; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;

    }

    public static void stupidSort(int[] array){

        //System.out.println(Arrays.toString(array));

        for (int i=0; i<array.length-1; i++ ){
            if (array[i] > array[i+1]){
                int buffer = array[i];
                array[i] = array[i+1];
                array[i+1] = buffer;
                i = -1;
            }
            iter++;
        }
    }

    public static void bubbleSort(int[] array){

        //System.out.println(Arrays.toString(array));

        int arrayLength = array.length;
        int max = 0;
        for (int i=array.length-1; i>0; i-- ){
            for (int y=0; y<i; y++) {
                if (array[y] > array[y+1]) {
                    int buffer = array[y];
                    array[y] = array[y+1];
                    array[y+1] = buffer;
                }
                iter++;
            }
        }
        System.out.println("ITER=" + iter);
    }

    public static void shakeSort(int[] array){

        //System.out.println(Arrays.toString(array));


        int left = 0;
        int right = array.length-1;
        //for (int i=0; i<array.length-1; i++){
        while (left < right){
            for (int y=left; y<right; y++) {
                if (array[y] > array[y+1]) {
                    int buffer = array[y];
                    array[y] = array[y+1];
                    array[y+1] = buffer;
                }
                iter++;
            }
            left++;
            for (int y=right; y>left; y--) {
                if (array[y] < array[y-1]) {
                    int buffer = array[y];
                    array[y] = array[y-1];
                    array[y-1] = buffer;
                }
                iter++;
            }
            right--;
            iter++;
        }
        System.out.println("ITER = " + iter);
    }

}
