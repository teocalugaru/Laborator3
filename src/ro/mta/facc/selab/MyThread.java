package ro.mta.facc.selab;

import java.util.Random;

public class MyThread extends Thread{
    @Override
    public void run() {
        Random generator=new Random();
        int timetoSleep=generator.nextInt(10)+10;
        try {
            Thread.sleep(timetoSleep * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(generator.nextInt());
    }
}
