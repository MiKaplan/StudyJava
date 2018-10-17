package array;
import method.ArrayReader;
public class BalanceChecker {
    public static void main(String[] args) {

        ArrayReader arrayReader = new ArrayReader();
        int [] array = arrayReader.arrayScan();
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length/2; j++) {
                firstSum += array [j];
            }
            for (int k =array.length/2 ; k <array.length ; k++) {
               secondSum += array [k];
            }

        }
        if (firstSum == secondSum){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
