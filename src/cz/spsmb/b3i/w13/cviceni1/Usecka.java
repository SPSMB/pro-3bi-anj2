package cz.spsmb.b3i.w13.cviceni1;

public class Usecka implements Zobrazitelny {
    int delka;

    public Usecka(int delka) {
        this.delka = delka;
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < delka; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
