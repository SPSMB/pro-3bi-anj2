package cz.spsmb.b3i.w23;

// 1,Napište program, který zapíše do souboru pole.txt
// deset řádků celých čísel takto:
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
// ...
// 91, 92, 93, 94, 95, 96, 97, 98, 99, 100

// 2, Napište program, který přečte soubor pole.txt a jednotlivé hodnoty uloží
// do dvourozměrného pole, které kontrolně vypíše na obrazovku. Celé pole pak
// uloží do souboru poleint.bin jako binární čísla (použijte writeInt() ze třídy
// DataOutputStream). Porovnejte velikosti souborů pole.txt a poleint.bin

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DomaciUkol {
    public static void main(String[] args) throws IOException {

        FileWriter fwForm = new FileWriter("pole.txt");
        PrintWriter form = new PrintWriter(fwForm);
        for (int i = 0; i < 101; i++) {
            System.out.print(i + " ");
            form.print(i + " ");// resp. form.format("%d ", i);
            if(i % 10 == 0 && i != 0){
                System.out.println("");
                form.println(" ");
            }
        }
        form.close();


    }
}
