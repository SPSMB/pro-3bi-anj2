package cz.spsmb.b3i.w12.cviceni_kolo;

public class HorskeKolo extends Kolo {
    private boolean maPrehazovackuVzadu;
    private boolean maPrehazovackuVepredu;

    @Override
    public boolean setMaPrehazovacku(boolean maPrehazovacku) {
        super.setMaPrehazovacku(maPrehazovacku);
        return true;
    }

    public HorskeKolo(String vyrobce, int cena, boolean maPrehazovackuVepredu, boolean maPrehazovackuVzadu) {
        super(vyrobce, cena,true);
        this.maPrehazovackuVepredu = maPrehazovackuVepredu;
        this.maPrehazovackuVzadu = maPrehazovackuVzadu;

    }
}