package cz.spsmb.b3i.w27.vlakna;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Vypočítejte konstantu pi pomocí modelu hodu šipkami do čtverce 2x2 o obsahu 4.
// Zjistěte, zda je hod šipkou uvnitř vepsané jednotkové kružnice tohoto čtverce. Hod šipkou je reprezentován náhodnými
// čísly typu double od -1 do 1. Pokud je bod uvnitř vepsané kružnice, platí x^2+Y^2<=1.
// Konstantu pi spočítáte jako pi = 4*No/N,
// kde N je celkový počet hodů
// No je pošet hodů do vepsaného kruhu.
// Můžete se inspirovat z resources/examples/c
// Použijte co největší počet hodů a vlákna pro urychlení výpočtu.
// Změřte dobu běhu pro verzi s vlákny a verzi bez vláken.
public class Ukol extends Thread{

    static double xcord;
    static double ycord;
    static int a = 2;
    static int sO = a*a;
    static int score;
    static int hod = 1000000;

    public void run() {

        long start = System.nanoTime();
        for (int i = 0; i < hod; i++) {
            xcord = ThreadLocalRandom.current().nextDouble(-1,1);
            ycord = ThreadLocalRandom.current().nextDouble(-1,1);
            if ((xcord * xcord) + (ycord * ycord) <= 1){
                score +=1;
            }
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        double elapsedTimeInSecond = (double) timeElapsed / 1_000_000_000;
        double pi = Math.ceil(sO * score) / hod;
        System.out.println("trefa do kruhu = " +score);
        System.out.println("pi = " + pi);
        System.out.println("Thread = " + elapsedTimeInSecond + " Second/s");
    }

    public static void main(String[] args) {
        Ukol thread = new Ukol();
        thread.start();
    }
}
