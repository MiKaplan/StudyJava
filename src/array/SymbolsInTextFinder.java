package array;

import java.util.Scanner;

public class SymbolsInTextFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine().toLowerCase();
        System.out.println("Enter what symbol you want to find");
        char symbol = scanner.next().toLowerCase().charAt(0);
        System.out.println(SymbolFinder(text, symbol));



    }
    private static int SymbolFinder(String text, char symbol){
    int len = text.length();
    int count = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
            
        }
        return count;
    }
}
