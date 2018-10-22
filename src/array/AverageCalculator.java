package array;

public class AverageCalculator {
    public static void main(String[] args) {
        int [] array = {17, 79, 42, 80, 50, 71, 33, 53, 20, 76, 70, 46, 63, 20, 22, 44, 44, 53, 55, 66, 46, 68, 66, 69, 61, 49, 10, 15, 31, 10, 25, 46, 54, 31, 27, 65, 10, 71, 70, 13, 16, 71, 12, 55, 52, 74, 30, 14, 80, 46};
double average = getAverageArray(array);
        System.out.println(average);
    }
public static double getAverageArray(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        sum += array[i];

    }
    return (sum/array.length);
}
}
