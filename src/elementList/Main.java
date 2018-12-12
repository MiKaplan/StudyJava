package elementList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));
        }

        System.out.println(Arrays.toString(arrayList.toArray()));

//        arrayList.remove(0);
//        arrayList.remove(0);
//        arrayList.remove(7);
//
//        System.out.println(Arrays.toString(arrayList.toArray()));

        arrayList = arrayList.subList(2, arrayList.size()-1);
        System.out.println(Arrays.toString(arrayList.toArray()));

    }
}
