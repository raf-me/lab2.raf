package mypokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Zapdos extends Pokemon{
    public Zapdos(String name, int lvl) {
        super(name, lvl);
        this.setStats(90.0, 90.0, 85.0, 125.0, 90.0, 100.0);
        this.setType(new Type[]{Type.ELECTRIC, Type.FLYING});
        this.setMove(new Move[]{new DoubleTeam(), new SteelWing(), new AncientPower(), new Facade()});
    }
}
