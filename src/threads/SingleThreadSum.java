package threads;

public class SingleThreadSum implements Runnable {
    private int [] array;
    private int from;
    private int to;
    private int sum;

    public SingleThreadSum(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    public SingleThreadSum() {
        super();
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = from; i < to; i++) {
            sum += array[i];
        }
    }
}
