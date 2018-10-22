package array;


public class FibonacciCalculator {
    public static void main(String[] args) {

        int number = 10000;
        double val = FibonacciValue(number);
        System.out.println(val);
    }

    public static int FibonacciValue(int number) {

            int [] fibArray = new int [number + 1];
            fibArray[0] = 0;
            fibArray[1] = 1;
            for (int i = 2; i < number + 1; i++) {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];

        }
        return fibArray[number];
    }
}



