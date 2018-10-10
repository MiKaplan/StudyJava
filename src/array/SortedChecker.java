package array;

import java.util.Arrays;

public class SortedChecker {
    public static void main(String[] args) {
        boolean isSort = false;
        int [] array = {1,  2, 3 ,5};
        int [] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        if (Arrays.equals(array, array2)) {

            System.out.println(isSort=true);

        } else {
            System.out.println(isSort=false);
        }
    }
}
