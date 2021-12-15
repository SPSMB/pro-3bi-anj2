package cz.spsmb.b3i.w15.trida_linked_list.ukol_fronta;

import cz.spsmb.b3i.w15.trida_linked_list.Zasobnik;

public class PouzitiFronty {
    public static void main(String[] args) {
        Fronta<String> fronta = new Fronta<>();
        fronta.add("prvni");
        fronta.add("druhy");
        fronta.add("treti");
        while(!fronta.isEmpty()) {
            System.out.println(fronta.get());
            fronta.remove();
        }
    }
}
