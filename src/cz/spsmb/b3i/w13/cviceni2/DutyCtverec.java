package cz.spsmb.b3i.w13.cviceni2;

import cz.spsmb.b3i.w13.cviceni1.Zobrazitelny;

public class DutyCtverec implements Zobrazitelny {
    int delka;

    public DutyCtverec(int delka) {
        this.delka = delka;
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < delka; i++) {
            for (int j = 0; j < delka; j++) {
                if (i == 0 || j == 0 || i == delka-1 || j == delka-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
