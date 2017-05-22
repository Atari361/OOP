import java.util.Arrays;

/**
 * Created by dell on 5/16/2017.
 */
public class Lesson2_sortTypes {

    public static int iter;
    public static void main(String[] args) {

        int[] array = getArray(10);
        int[] arrayCopy = getArrayCopy(array);
        System.out.println(Arrays.toString(arrayCopy));
//        stupidSort(arrayCopy);
//        bubbleSort(arrayCopy);
//        shakeSort(arrayCopy);
//        selectionSort(arrayCopy);
//        insertSort(arrayCopy);
        System.out.println(Arrays.toString(arrayCopy));
        System.out.println("ITER = " + iter);
    }

    private static void insertSort(int[] array) {
        for (int i=1; i < array.length; i++ ) {
            for (int y=i; y > 0; y--) {
                if (array[y] < array[y-1]){
                    swap(array, y, y-1);
                }
                iter++;
            }
            iter++;
        }
    }

    private static void selectionSort(int[] array) {
        for (int i=0; i < array.length; i++ ){
            int min = array[i];
            int minIndex = i;
            for (int y=i+1; y < array.length; y++) {
                if (min > array[y]) {
                    min = array[y];
                    minIndex = y;
                }
                iter++;
            }
            swap(array, i, minIndex);
            iter++;
        }
    }

    public static void shakeSort(int[] array){

        int left = 0;
        int right = array.length-1;
        while (left < right){
            for (int y=left; y<right; y++) {
                if (array[y] > array[y+1]) {
                    swap(array, y, y+1);
                }
                iter++;
            }
            right--;
            for (int y=right; y>left; y--) {
                if (array[y] < array[y-1]) {
                    swap(array, y, y-1);
                }
                iter++;
            }
            left++;
            iter++;
        }
    }

    public static void bubbleSort(int[] array){

        for (int i=array.length-1; i>0; i-- ){
            for (int y=0; y<i; y++) {
                if (array[y] > array[y+1]) {
                    swap(array, y, y+1);
                }
                iter++;
            }
            iter++;
        }
    }

    public static void stupidSort(int[] array){
        for (int i=0; i<array.length-1; i++ ){
            if (array[i] > array[i+1]){
                swap(array, i, i+1);
                i = -1;
            }
            iter++;
        }
    }

    public static void swap(int [] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
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

}
