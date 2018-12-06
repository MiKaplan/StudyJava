package threads;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[1_000_000];
        Random random = new Random();
        Timer timerOne = new Timer();
        Timer timerTwo = new Timer();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(10);
        }

        ThreadSum threadSum = new ThreadSum(array, 2);
        timerOne.start();
        System.out.println(threadSum.getSum());
        timerOne.treadResult();

        SingleSum singleSum = new SingleSum();
        timerTwo.start();
        System.out.println(singleSum.getSum(array));
        timerTwo.singleResult();


    }

}
