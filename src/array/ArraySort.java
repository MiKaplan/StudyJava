package array;

import method.ArrayReader;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
sortArray();
    }
    public static void sortArray(){
        ArrayReader ar = new ArrayReader();
        int [] array = ar.arrayScan();
        System.out.println(Arrays.toString(array));
//        int a = array[2];
//        array [2] = array [5];
//        array [5] = a;
//        System.out.println(Arrays.toString(array));
        int min = array[0];
        int next = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                array[i] = min;
                next = i;
            }


        }

    }
}
