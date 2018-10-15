package method;

import java.util.Arrays;

public class ArrayReaderVizov {
    public static void main(String[] args) {
        ArrayReader arrayReader = new ArrayReader();
        int [] arr = arrayReader.arrayScan();
        System.out.println(Arrays.toString(arr));
    }


}
