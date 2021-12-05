package cz.spsmb.b3i.w14.kolekce;

import java.util.ArrayList;

//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer>() pro milión prvků;
public class Ukol {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int N = 1000000;
        ArrayList<Integer> sar = new ArrayList<>(N);
        ArrayList<Integer> ar = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sar.add(i);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        double elapsedTimeInSecond = (double) timeElapsed / 1_000_000_000;

        long start1 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ar.add(i);
        }
        long finish1 = System.nanoTime();
        long timeElapsed2 = finish1 - start1;
        double elapsedTimeInSecond2 = (double) timeElapsed2 / 1_000_000_000;
        System.out.println("ar = new ArrayList<Integer>(N) " + elapsedTimeInSecond + " Second/s");
        System.out.println("sar = new ArrayList<Integer>() " + elapsedTimeInSecond2 + " Second/s");
        if(elapsedTimeInSecond < elapsedTimeInSecond2){
            System.out.println(ANSI_GREEN+"Rychlejší je ar"+ANSI_RESET);
        }
         else if(elapsedTimeInSecond2 < elapsedTimeInSecond){
            System.out.println(ANSI_GREEN+"Rychlejší je sar"+ANSI_RESET);
        }else{
            System.out.println("Oba jsou stejně rychlé");
        }
    }
}
