package method;

import java.util.Scanner;

public class ArrayReader {
    public int[] arrayScan () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array [i] = sc.nextInt();
        }
        return array;
    }

}

