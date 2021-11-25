package cz.spsmb.b3i.w12.cviceni_kolo;

// Vytvořte třídu Kolo s proměnnými vyrobce, cena a boolean maPrehazovacku.
// Doplňte do této třídy příslušné metody a konstruktory. Děděním vytvořte
// třídu HorskeKolo, kterému doplňte členské proměnné int prevodyVzadu,
// prevodyVpredu. Zajistěte, aby konstruktor správně vytvářel objekty této
// třídy (např. proměnná maPrehazovacku musí být vždy true).
public class Kolo {
    private String vyrobce;
    private int cena;
    private boolean maPrehazovacku;

    public Kolo(String vyrobce, int cena, boolean maPrehazovacku){
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.maPrehazovacku = maPrehazovacku;
    }

    public String getVyrobce() {
        return vyrobce;
    }


    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean isMaPrehazovacku() {
        return maPrehazovacku;
    }

    public boolean setMaPrehazovacku(boolean maPrehazovacku) {
        this.maPrehazovacku = maPrehazovacku;
        return maPrehazovacku;
    }


}
