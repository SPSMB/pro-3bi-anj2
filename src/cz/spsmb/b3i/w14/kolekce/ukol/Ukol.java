package cz.spsmb.b3i.w14.kolekce.ukol;

import javax.swing.*;
import java.util.ArrayList;
import java.util.function.Consumer;

//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer>() pro milión prvků;
public class Ukol {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList<Integer>(1000000){
        };

        ArrayList arr = new ArrayList<Integer>();
        int x = 1000000;
        for (int i = 0; i < x; i++) {
            arr.add(1);
            long t1 = System.nanoTime();
            System.out.format("20!=%d (%dns), rekurzivně:20!=%d (%dns)", t1);
            System.out.println();
        }

    }
}