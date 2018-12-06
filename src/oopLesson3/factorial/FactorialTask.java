package oopLesson3.factorial;

import java.math.BigInteger;

public class FactorialTask implements Runnable {

    private int n;

    public FactorialTask(int n) {
        this.n = n;
    }
    public BigInteger factorial (int number) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= number ; i++) {
        fact = fact .multiply( new BigInteger("" + i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i <= this.n ; i++) {
            System.out.println(thr.getName() + " => " + i + " != " + factorial(i));
        }
    }
}
