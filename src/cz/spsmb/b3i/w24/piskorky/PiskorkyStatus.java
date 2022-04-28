package cz.spsmb.b3i.w24.piskorky;
import java.io.Serializable;
import java.util.*;

/**
 * Třída reprezentující status Piškvorky
 */
public class PiskorkyStatus implements Serializable {

    /**
     * Jedná se o verzi
     */
    public final String VERSION = "1.13";
    /**
     * n je rozměr hrací plochy a počet vítězných tahů je nastaven na 4
     */
    public final int nViteznych = 4;
    /**
     * Doba mezi koncem tahu prvního hráče a začátkem tahu druhého hráče
     */
    public final int TIMEOUT = 10000;
    int rozmerHraciPlochy;
    int nTah = 1;
    //int[][] herniPlochaHracu;
    ArrayList<String> hraci;
    Map[][] herniTlacitka;
    //aktivni Hráč se zde automaticky inicializuje na 0 (LOJZA), netřeba inicializovat
    int aktivniHrac;
    boolean isStarted;
    boolean isEnded;


    /**
     * @param rozmerHraciPlochy hraje se na ploše n krát n, kde n je rozměr hrací plochy
     */
    public PiskorkyStatus(int rozmerHraciPlochy) {
        this.rozmerHraciPlochy = rozmerHraciPlochy;
        //this.herniPlochaHracu = new int[this.rozmerHraciPlochy + 1][this.rozmerHraciPlochy + 1];
        //for (int i = 0; i < this.herniPlochaHracu.length; i++) {
        //    Arrays.fill(this.herniPlochaHracu[i], (byte) -1);
        // }
        this.herniTlacitka = new HashMap[this.rozmerHraciPlochy + 1][this.rozmerHraciPlochy + 1];
        this.hraci = new ArrayList<>();
        //this.hraci.add("Lojza");
        //this.hraci.add("Franta");
        //this.hraci.add("Pepa");
        this.inicializaceTlacitek();
    }


    /**
     * Resetuje hrací plochu, smaže všechen postup
     */
    public void clean(){
        this.inicializaceTlacitek();
        this.hraci.clear();
        this.aktivniHrac = 0;
        this.isStarted = false;
        this.isEnded = false;
    }

    /**
     * @param jmeno -jmeno hrace, pokud již existuje první písmeno v seznamu hráčů, tak se hráč nepřidá
     * @return
     */
    public boolean pridatHrace(String jmeno){
        for (String hrac : this.hraci) {
            if(hrac.charAt(0) == jmeno.charAt(0)){
                return true;
            }
        }
        this.hraci.add(jmeno);
        return false;
    }

    /**
     * Spuštění hry
     */
     public void start(){
        this.isStarted = true;


     }

    /**
     * Pokud hráč udělá svůj tah, tak se přepne na druhého hráče
     */
     public void prepnutiHrace(){
         if(!this.isEnded){
             //přepnutí hráče
             if (++this.aktivniHrac >= this.hraci.size()) {
                 this.aktivniHrac = 0;
             }
             //stisknuteTlacitko.getProperties().put("player", this.ps.aktivniHrac);
         }


     }


    /**
     * Aktivování tlačítek pro hru
     */
    public void inicializaceTlacitek(){
        for (int i = 0; i < this.rozmerHraciPlochy + 1; i++) {
            for (int j = 0; j < this.rozmerHraciPlochy + 1; j++) {
                HashMap om =new HashMap();
                this.herniTlacitka[i][j] = om;
                om.put("i", Integer.valueOf(i));
                om.put("j", Integer.valueOf(j));
                om.put("player", Integer.valueOf(-1));
            }
        }
    }
    public ArrayList<String> getHraci(){
        return this.hraci;
    }
}
