package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array [i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
