package theBigBangTheory;

import java.util.ArrayDeque;


public class Queue extends ArrayDeque<String> {
    private int num;



        public Queue(int num) {
        this.num = num;
        this.push("Sheldon");
        this.push("Leonard");
        this.push("Volovitz");
        this.push("Kutrapalli");
        this.push("Penny");
    }

    public void getGlass(){
        System.out.println(this);
        System.out.println("Enter num of glasses:");

        for (int i = 0; i < this.num; i++) {
            this.addLast(this.getFirst());
            this.addLast(this.getFirst());
            this.remove();
        }
        System.out.println(this);
    }
}
