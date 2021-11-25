package cz.spsmb.b3i.w12.cviceni_vozidlo;

public class Test {
    public static void main(String[] args) {
        Kolo k = new Kolo("Popel","Masseratti");
        Motocykl m = new Motocykl(50, "Zavodni");
        HorskeKolo h = new HorskeKolo("Horske kolo", 9, "Author");

        k.vypisCoJsiZac();
        m.vypisCoJsiZac();
        h.vypisCoJsiZac();
    }
}
