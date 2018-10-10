package array;

import java.util.Arrays;

public class ArrayLastPositiveFinder {
    public static void main(String[] args) {
        int lastPositive = 0;
        int [] array = {0, -40, -1, -3, -1, -3};
        for (int i = 0; i < array.length; i++) {
         if (array[i] > 0) {
             lastPositive = array[i];
         }
        } if (lastPositive==0){
            lastPositive=Integer.MIN_VALUE;
        }
        System.out.println(lastPositive);
    }
}
