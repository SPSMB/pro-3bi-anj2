package cz.spsmb.b3i.w13.cviceni1;

import cz.spsmb.b3i.w13.cviceni2.DutyCtverec;

public class Test {
    public static void main(String[] args) {
        Usecka u = new Usecka(6);
        u.zobraz();//funguje
        System.out.println("↑úsečka↑");
        Ctverec c = new Ctverec(6);
        c.zobraz();//funguje
        System.out.println("↑čtverec↑");
        DutyCtverec d = new DutyCtverec(5);
        d.zobraz();
        System.out.println("↑dutý čtverec↑");
    }
}
