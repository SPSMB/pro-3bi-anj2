package cz.spsmb.b3i.w15.trida_linked_list.ukol_fronta;

import java.util.LinkedList;

//Domácí úkol do 16.12.:
//použijte LinkedList pro implementaci abstraktního datového typu fronta
//tj. totéž, co bylo uděláno v třídách Zasobnik a PouzitiZasobniku analogicky
//pro frontu
public class Fronta<E> {
    private LinkedList<E> stack = new LinkedList<E>();

    public void add(E elem) {
        stack.addFirst(elem);
    }

    public E remove() {
        return stack.removeLast();
    }

    public E get() {
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
