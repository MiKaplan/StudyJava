package array;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] array = new int [size];
        for (int i = 0; i < size ; i++) {
            array [i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
