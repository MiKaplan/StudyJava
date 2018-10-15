package array;
import method.ArrayReader;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicShifter {
    public static void main(String[] args) {
        ArrayReader ar = new ArrayReader();
        int[] array = ar.arrayScan();
        if (array.length < 2) {
            System.out.println("Please, enter array size >= 2");
            System.exit(-1);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter shift: ");
        int shiftPos = scanner.nextInt();
        if (shiftPos > 0){
            shiftRight(array, shiftPos);
        } else if (shiftPos < 0) {
            shiftPos = Math.abs(shiftPos);
            shiftLeft(array, shiftPos);
        }
        System.out.println(Arrays.toString(array));


    }


    public static void shiftRight(int[] array, int shiftPositions) {
        int size = array.length;


        for (int i = 0; i < shiftPositions; i++) {
            int temp = array[size - 1];

            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = temp;
        }
    }

    public static void shiftLeft (int [] array, int shiftPositions) {
        int size = array.length;

        for (int i = 0; i < shiftPositions; i++) {
            int temp = array[0];

            for (int j = 0; j < size-1; j++) {
                array[j] = array[j+1];
            }

            array[size-1] = temp;
        }
    }

}
