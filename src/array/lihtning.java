package array;

import java.util.Scanner;

public class lihtning {
    public static void main(String[] args) {
        getTime();

    }
    public static void getTime(){
       double speed = 0.33;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time of lightning");
        double time = sc.nextDouble();
        double rezult = speed*time;
        System.out.println("Distance is: " + rezult);
    }
}
