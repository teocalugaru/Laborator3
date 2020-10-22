package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        /*Ex2
        Carte c=new Carte("Casa Buddenbrook","Thomas Mann",1990,533);
        //System.out.println(c);
        Biblioteca b=new Biblioteca();
        b.addCarte(c);
        b.addCarte(new Carte("Codul lui Da Vinci","Dan Brown",1999,500));
        b.addCarte(new Carte("Amintiri din copilarie","Ion Creanga",1881,80));
        b.sort();
        System.out.println(b);
        */

        //Ex4
        Thread thread1=new MyThread();
        Thread thread2=new MyThread();
        Thread thread3=new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
