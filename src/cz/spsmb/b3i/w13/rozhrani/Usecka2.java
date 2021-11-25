package cz.spsmb.b3i.w13.rozhrani;

public class Usecka2 implements Info, InfoDalsi {
    private int delka;

    public Usecka2(int delka) {
        this.delka = delka;
    }

    @Override
    public void kdoJsem() {
        System.out.print("Usecka");
    }

    @Override
    public void vlastnosti() {
        System.out.println(" = " + this.delka);
    }

    public static void main(String[] args) {
        Usecka2 u = new Usecka2(5);
        u.kdoJsem(); u.vlastnosti();
    }
}
