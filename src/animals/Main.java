package animals;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(4, 6, true, "Milk", "Vasia", "Syam");
//        System.out.println(cat1.getAge());
//        System.out.println(cat1.hashCode());
//
//        cat1.getVoice();
//        System.out.println(cat1);
//
//
//        Animals an = cat1;
//        an.getVoice();
//
//        Cat cat2 = (Cat) an;
//        cat2.getName();
//    }

        Animals[] zoo = new Animals[10];
        zoo[0] = cat1;
    }
}
