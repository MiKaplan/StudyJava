package array;


import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        testField();
        getRules();
    }

    static char[][] array = new char[3][3];
    static char x = 'X';
    static char o = '0';
    static Scanner scanner = new Scanner(System.in);

    public static void getRules(){
        int[] numOfMoves = new int[9];
        int counter = 0;
        for (int i = 0; i < numOfMoves.length; i++) {
            counter++;
            if (i % 2 == 0) {
                movePlayer1();
                getField();
            } else {
                movePlayer2();
                getField();
            }
            victoryCondition();
            if (counter == numOfMoves.length) {
                System.out.println("Draw");
            }
        }
    }
    public static void testField(){
        char a = ' ';
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array [i][j] = a;
            }
        }
        getField();
    }

    public static void getField() {
        System.out.println( " " + array[0][0] + " |" + array[1][0] + "  |" + array[2][0] + "\n" + " —" + " " + " —" + " " + " —" + "\n" +" " + array[0][1] + " |" + array[1][1] + "  |" + array[2][1] + "\n" + " —" + " " + " —" + " " + " —" + "\n" +" " + array[0][2] + " |" + array[1][2] + "  |" + array[2][2] );
    }

    public static void movePlayer1() {

        System.out.println("Player 1: Enter the 'X' coordinate for the line (from 0 to 2):");
        int player1Line = scanner.nextInt();
        System.out.println("Enter the 'X' coordinate for the column (from 0 to 2):");
        int player1Column = scanner.nextInt();
        if (player1Line > 2 || player1Line < 0 || player1Column > 2 || player1Column < 0) {
            System.out.println("Please, enter the coordinate from 0 to 2:");
            movePlayer1();
        } else if (array[player1Column][player1Line] == o) {
            System.out.println("This coordinates are busy. Please change.");
            movePlayer1();
        } else {
            array[player1Column][player1Line] = x;
        }
    }

    public static void movePlayer2() {
        System.out.println("Player 2: Enter the '0' coordinate for the line (from 0 to 2):");
        int player2Line = scanner.nextInt();
        System.out.println("Enter the '0' coordinate for the column (from 0 to 2):");
        int player2Column = scanner.nextInt();
        if (player2Line > 2 || player2Line < 0 || player2Column > 2 || player2Column < 0) {
            System.out.println("Please, enter the coordinate from 0 to 2.");
            movePlayer2();
        } else if (array[player2Column][player2Line] == x) {
            System.out.println("This coordinates are busy. Please change.");
            movePlayer2();
        } else {
            array[player2Column][player2Line] = o;
        }
    }


    public static void victoryCondition() {
        if (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X' || array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X' ||
                array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X' || array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X' ||
                array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X' || array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X' ||
                array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X' || array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X') {
            System.out.println("Player 1 win!");
            System.exit(0);
        } else if (array[0][0] == '0' && array[0][1] == '0' && array[0][2] == '0' || array[1][0] == '0' && array[1][1] == '0' && array[1][2] == '0' ||
                array[2][0] == '0' && array[2][1] == '0' && array[2][2] == '0' || array[0][0] == '0' && array[1][0] == '0' && array[2][0] == '0' ||
                array[0][1] == '0' && array[1][1] == '0' && array[2][1] == '0' || array[0][2] == '0' && array[1][2] == '0' && array[2][2] == '0' ||
                array[0][0] == '0' && array[1][1] == '0' && array[2][2] == '0' || array[0][2] == '0' && array[1][1] == '0' && array[2][0] == '0') {
            System.out.println("Player 2 win!");
            System.exit(0);
        }
    }

}
