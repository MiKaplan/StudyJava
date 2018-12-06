package threads;

public class SingleSum {
    private int[] array;

    public  int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
