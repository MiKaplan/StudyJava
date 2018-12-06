package oopLesson3.factorial.homework;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            new Thread(new Factorial()).start();
        }
    }
}
