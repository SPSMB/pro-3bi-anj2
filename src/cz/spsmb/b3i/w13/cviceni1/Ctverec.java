package cz.spsmb.b3i.w13.cviceni1;

public class Ctverec implements Zobrazitelny {
    int delka;

    public Ctverec(int delka) {
        this.delka = delka;
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < delka; i++) {
            for (int j = 0; j < delka; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
