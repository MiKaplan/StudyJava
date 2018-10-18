package array;
import method.ArrayReader;

import java.util.Arrays;

public class ArrayTask1 {
    public static void main(String[] args) {
        ArrayReader arrayReader = new ArrayReader();
        int [] array = arrayReader.arrayScan();
        reverse(array);


    }
    public static void reverse(int [] array){
        for (int i = 0; i < array.length/2 ; i++) {
            int temp = array[i];
            array [i] = array[array.length - 1 - i];
            array[array.length - 1 - i ] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
