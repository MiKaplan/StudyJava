package threads;

public class ThreadSum{
    private int[] array;
    private int threads;
    private Thread[] threadArray;
    private SingleThreadSum[] singleArray;

    public ThreadSum(int[] array, int threads) {
        this.array = array;
        this.threads = threads;
        this.threadArray = new Thread[this.threads];
        singleArray = new SingleThreadSum[this.threads];
    }

    public int getSum(){
        int sum = 0;
        int from = 0;
        int to = 0;
        int step = array.length / threadArray.length;

        for (int i = 0; i <threadArray.length; i++) {
            from = step * i;
            if (array.length - step * (i + 1) < step){
                to = array.length;
            } else {
                to = step * (i + 1);
            }
            singleArray [i] = new SingleThreadSum(array, from, to);
            threadArray[i] = new Thread(singleArray[i]);
            threadArray[i].start();
        }

        for (int i = 0; i < threadArray.length; i++) {
            try {
                threadArray[i].join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for (int i = 0; i < singleArray.length ; i++) {
            sum += singleArray[i].getSum();
        }

        return sum;
    }
}

