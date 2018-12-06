package oopLesson3.factorial.homework;

import java.math.BigInteger;

public class Factorial implements Runnable{
    private static int counter = 0;
    private int num;

    public Factorial() {
        this.counter++;
        this.num = counter;
    }

    public static int getCounter() {
        return counter;
    }

    public int getNum() {
        return num;
    }


    @Override
    public void run() {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= num ; i++) {
           fact = fact.multiply(new BigInteger(""+i));

        }
        System.out.println("Thread # " + num + " - fact = " + fact);

    }
}
