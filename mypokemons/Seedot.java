package mypokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon {
    public Seedot(String name, int lvl) {
        super(name, lvl);
        this.setStats(40.0, 40.0, 50.0, 30.0, 30.0, 30.0);
        this.setType(new Type[]{Type.GRASS});
        this.setMove(new Move[]{new EnergyBall(), new ShadowBall()});
    }
}
