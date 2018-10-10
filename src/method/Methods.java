//Методы

package method;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        //System.out.println(getSum(a,b));
//        System.out.println(isAge(121));
//        String s = input.nextLine();
//        System.out.println(lastChar(s));
//        System.out.println(rangeSum(a,b));
          printEvens(a,b);

    }
    public static int getSum(int a, int b){
        return a+b;
    }
    public static boolean isAge(int age) {
        if (age > 0 && age <= 120) {
            return true;
        } else {
            return false;
        }
    }
    public static char lastChar(String s){

        int len = s.length();

        if (len == 0) {
            throw new IllegalArgumentException("Enter your text! ");
        } else {
            char lastChar = s.charAt(s.length() - 1);
            return lastChar;
        }
    }
    public static int rangeSum(int from, int to) {
        int suma=0;
        if (from > to) {
            throw new IllegalArgumentException("Change numbers! ");
        } else
        for (int i = from;i<= to; i++) {
            suma+=i;
        }
        return suma;
    }
    public static void printEvens(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("Change numbers! ");
        } else {
            for (int i = from; i <= to; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}


