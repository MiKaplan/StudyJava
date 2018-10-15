package array;
import method.ArrayReader;

public class FrequentElemFinder {
    public static void main(String[] args) {
        ArrayReader arr = new ArrayReader();
        int[] array = arr.arrayScan();
        findFrequentElem(array);
        System.out.println(findFrequentElem(array));
    }

    public static int findFrequentElem(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Error");
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter > max) {
                    max = counter;
                    num = array[i];
                }

            }

        }
        return num;
    }
}