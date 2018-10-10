package array;


import java.util.Scanner;

public class ArrayHomework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int [] arr = {num1, num2, num3};
        for (int i = arr.length -1; i >=0 ; i--) {
            if (arr[i] >= 0) {

                System.out.print(arr[i]+" ");
            }
        }
    }
}

