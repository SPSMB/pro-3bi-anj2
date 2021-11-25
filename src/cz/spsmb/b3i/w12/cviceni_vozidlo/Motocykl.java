package cz.spsmb.b3i.w12.cviceni_vozidlo;

public class Motocykl extends JednostopeVozidlo{
    private int ObsahNadrze;

    public Motocykl(int obsahNadrze, String druh) {
        this.ObsahNadrze = obsahNadrze;
        this.druh = druh;
    }

    @Override
    public void vypisCoJsiZac() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "druh='" + druh + '\'' +
                ", ObsahNadrze=" + ObsahNadrze +
                '}';
    }
}
