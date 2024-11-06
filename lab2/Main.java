package lab2;
import mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Zapdos p1 = new Zapdos("first",1);
        Zigzogoon p2 = new Zigzogoon("second", 1);;
        Linoone p3 = new Linoone("third",1);
        Seedot p4 = new Seedot("fourth", 1);
        Nuzleaf p6 = new Nuzleaf("fifth", 1);
        Shiftry p5 = new Shiftry("sixth",1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }
}