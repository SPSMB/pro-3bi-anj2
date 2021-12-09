package cz.spsmb.b3i.w14.kolekce.cviceni_zolik_s_omezenim;

public class TridaJedna implements ITisknutleny{
  protected int had;

    public TridaJedna(int had) {
        this.had = had;
    }

    @Override
    public void tiskni() {
      System.out.println(had);

    }
}
