package threads;

import java.awt.*;

public class Timer {
    private double timeOne;
    private double timeTwo;

    public void start(){
        timeOne = System.currentTimeMillis();
    }


    public void treadResult(){
        timeTwo = System.currentTimeMillis();
        System.out.println("Thread sum: " + (timeTwo - timeOne) +"ms.");
    }
    public void singleResult(){
        timeTwo = System.currentTimeMillis();
        System.out.println("Single sum: " + (timeTwo - timeOne) +"ms." );
    }

}