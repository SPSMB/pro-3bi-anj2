package cz.spsmb.b3i.w10.tridy2;

public class BankovniUcet {
    //tyto proměnné se v Javě automaticky inicializují na 0
    private static int aktualniCisloUctu;
    private int zustatek;
    private int cisloUctu;
    //private int klientskeCislo;
    private Klient klient;

    public BankovniUcet(int zustatek, Klient klient) {
        //zde nepoužívat this. Sice to možné je, ale vzhledem k tomu, že jde o proměnnou třídy
        //bylo by to nepřehledné
        BankovniUcet.aktualniCisloUctu++;
        this.zustatek = zustatek;
        this.cisloUctu = BankovniUcet.aktualniCisloUctu;
        this.klient = klient;
        //this.klientskeCislo = klientskeCislo;
    }
    public int getZustatek() {
        return zustatek;
    }
    //vrátí false v případě neúspěchu
    public boolean vyberPenize(int castka){
        if(castka > 0 && castka <= this.zustatek){
            this.zustatek -= castka;
            return true;
        }
        return false;
    }
    public boolean vlozPenize(int castka){
        if(castka > 0) {
            this.zustatek += castka;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankovniUcet{" +
                "zustatek=" + zustatek +
                ", cisloUctu=" + cisloUctu +
                ", klient=" + klient +
                '}';
    }
}
