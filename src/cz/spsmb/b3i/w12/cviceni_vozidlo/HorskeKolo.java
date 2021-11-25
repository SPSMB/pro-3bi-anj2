package cz.spsmb.b3i.w12.cviceni_vozidlo;

public class HorskeKolo extends JednostopeVozidlo{
    private int PocetPrevodu;
    private String vyrobce;

    public HorskeKolo(String druh,int PocetPrevodu, String vyrobce) {
        this.vyrobce=vyrobce;
        this.PocetPrevodu = PocetPrevodu;
        this.druh = druh;
    }

    @Override
    public void vypisCoJsiZac() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "HorskeKolo{" +
                "PocetPrevodu=" + PocetPrevodu +
                ", vyrobce='" + vyrobce + '\'' +
                ", druh='" + druh + '\'' +
                '}';

    }
}
