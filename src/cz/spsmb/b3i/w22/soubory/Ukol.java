package cz.spsmb.b3i.w22.soubory;

// 1.
// Textovým editorem vytvořte soubor pismena.txt, ve kterém bude
// několik řádek složených z malých a velkých písmen a mezer.
// Napište program, který tento soubor přečte a opíše na obrazovku.
// Současně do souboru velky.txt zapisuje obsah čteného souboru,
// ale malá písmena převádí na velká
// 2.
// Napište program, který přečte soubor pismena.txt po řádcích. Každou
// řádku přesně opíše do souboru kolik.txt a v něm na další řádce uvede,
// kolik malých písmen na ní bylo

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Ukol {
    public static void main(String[] args) throws IOException {

        /* 1.
        FileReader fr = new FileReader("pismena.txt");
        BufferedReader in = new BufferedReader(fr);
        FileWriter fw = new FileWriter("velky.txt");
        BufferedWriter out = new BufferedWriter(fw);
        String radka;

        while((radka = in.readLine()) != null) {
            System.out.println(radka);
            out.write(radka.toUpperCase(Locale.ROOT));
            out.newLine();
        }
        fr.close();
        out.close();
         */




        File f = new File("pismena.txt");
        Scanner scanner = new Scanner(f);
        FileReader fr = new FileReader("pismena.txt");
        BufferedReader in = new BufferedReader(fr);
        FileWriter fw = new FileWriter("kolik.txt");
        BufferedWriter out = new BufferedWriter(fw);
        String radka;
        int pom = 0;

        while ((radka = in.readLine()) != null) {
            System.out.println(radka);
            out.write(radka);
            out.newLine();
        }

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isLowerCase(ch)) {
                    pom++;
                }
            }
            System.out.println(pom);
            out.write(String.valueOf(pom));
            out.newLine();
        }
            fr.close();
            out.close();


    }
}


