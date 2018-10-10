package array;

public class ArrayAverageCalculator {
    public static void main(String[] args) {

        int sum = 0;
        int [] array = {5, 3, 5, 8};
        if (array.length ==0){
            System.out.println("Error!");
            System.exit(-1);
        }
        for (int i=0; i<array.length;i++){
            sum+= array[i];
        }
        int average = sum/array.length;

        System.out.println(average);
    }
}
