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

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;


public class DomaciUkol {
    public static void main(String[] args) throws IOException {

        FileWriter fwForm = new FileWriter("pole.txt");
        PrintWriter form = new PrintWriter(fwForm);
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            form.print(i + " ");// resp. form.format("%d ", i);
            if(i % 10 == 0 && i != 0){
                System.out.println("");
                form.println(" ");
            }
        }
        form.close();


        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("poleint.bin"));
        Scanner in = new Scanner(new File("pole.txt"));
        int N = 10;
        int[][] arr = new int[N][N];

        for(int r=0; r<arr.length; r++) {
            for(int c=0; c<arr[r].length; c++) {
                arr[r][c]=in.nextInt();
                dataOut.writeInt(arr[r][c]);
            }
        }
        dataOut.close();
        System.out.println(Arrays.deepToString(arr));
        Path path = Paths.get("pole.txt");
        long size = Files.size(path);
        Path path1 = Paths.get("poleint.bin");
        long size1 = Files.size(path1);

        if(size < size1){
            System.out.println("poleint.bin je větší má " + size1 + " bajtů");
        } else if(size1 <size){
            System.out.println("pole.txt je větší má " + size1 + " bajtů");
        }

    }
}
