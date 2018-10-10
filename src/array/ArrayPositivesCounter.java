package array;

public class ArrayPositivesCounter {
    public static void main(String[] args) {
        int counter = 0;
        int [] array = {-3, 0, -1, 4, -2, 5};
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
