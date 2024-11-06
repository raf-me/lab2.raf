package mypokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Pokemon {
    public Shiftry(String name, int lvl) {
        super(name, lvl);
        this.setStats(90.0, 100.0, 60.0, 90.0, 60.0, 80.0);
        this.setType(new Type[]{Type.GRASS, Type.DARK});
        this.setMove(new Move[]{new EnergyBall(), new ShadowBall(), new LeafBlade(), new Hurricane()});
    }
}
