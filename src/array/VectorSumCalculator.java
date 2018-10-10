package array;

import java.util.Arrays;

public class VectorSumCalculator {
    public static void main(String[] args) {


        int [] firstArray = {3, 5};
        int [] secondArray = {3, 6, 10};
        if (firstArray.length > secondArray.length) {
            int [] sum = new int[secondArray.length];
            for (int i = 0; i < secondArray.length; i++) {
                sum [i] = firstArray[i] +  secondArray[i];
            }
            System.out.print(Arrays.toString(sum));
        } else {
            int [] sum = new int[firstArray.length];
            for (int i = 0; i < firstArray.length ; i++) {
                sum [i] = firstArray [i] + secondArray [i];
            }
            System.out.print(Arrays.toString(sum));
        }
    }
}
