package array;
import method.ArrayReader;
public class LongestSequenceFinder {
    public static void main(String[] args) {
        ArrayReader arrayReader = new ArrayReader();
        int[] array = arrayReader.arrayScan();
        findLongestSequence(array);
        System.out.println(findLongestSequence(array));

    }

    public static int findLongestSequence(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException("Enter array lenght > 0");
        }
        int max = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == array[i++]) {
                counter++;
            }
            if (counter > max){
                max = counter;
            }


        }
        return max;
    }
}
