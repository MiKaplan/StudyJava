package array;

import java.util.Scanner;

public class OddSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNum = scanner.nextInt();
        System.out.println(SumCalculator(firstNum, secondNum));
    }
    private static int SumCalculator(int from, int to){
        if (from >= to) {
            throw new IllegalArgumentException("Enter second number bigger then first number");
        } else {
            int sum = 0;
            for (int i = from; i <= to ; i++) {
                if (i%2 != 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
