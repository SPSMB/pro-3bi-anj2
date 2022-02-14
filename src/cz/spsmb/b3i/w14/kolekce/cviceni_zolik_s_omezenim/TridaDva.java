package cz.spsmb.b3i.w14.kolekce.cviceni_zolik_s_omezenim;

public class TridaDva implements ITisknutleny{
    protected String uzovka;

    public TridaDva(String uzovka) {
        this.uzovka = uzovka;
    }

    @Override
    public void tiskni() {
        System.out.println(uzovka);
    }
}
