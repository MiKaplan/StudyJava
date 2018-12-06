package oopLesson3.factorial;

public class Main {
    public static void main(String[] args) {
        Thread thr = Thread.currentThread();

        FactorialTask taskOne = new FactorialTask(10);
        FactorialTask taskTwo = new FactorialTask(100);
        FactorialTask taskThree = new FactorialTask(1000);

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        Thread threadThree = new Thread(taskThree);

        threadOne.start();
        threadTwo.start();
        threadThree.start();

        System.out.println(thr.getName() + " STOP");
    }
}
