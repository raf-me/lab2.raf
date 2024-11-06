package mypokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Pokemon {
    public Nuzleaf(String name, int lvl) {
        super(name, lvl);
        this.setStats(70.0, 70.0, 40.0, 60.0, 40.0, 60.0);
        this.setType(new Type[]{Type.GRASS, Type.DARK});
        this.setMove(new Move[]{new EnergyBall(), new ShadowBall(), new LeafBlade()});
    }
}
