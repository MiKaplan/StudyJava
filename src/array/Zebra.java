package array;

import java.util.Arrays;

public class Zebra {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(createZebra(1)));

    }
    public static String[] createZebra(int size) {

        String black = "black";
        String white = "white";
        String[] zebra = new String[size];
        if (size <= 0) {
            throw new IllegalArgumentException("Enter positive radius");
        }
        for (int i = 0; i < zebra.length; i++) {
            if (i % 2 == 0) {
                zebra[i] = black;
            } else  {
                zebra[i] = white;
            }
        }
        return zebra;
    }
}
