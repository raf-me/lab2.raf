package mypokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Zigzogoon extends Pokemon{
    public Zigzogoon(String name, int lvl) {
        super(name, lvl);
        this.setStats(38.0, 30.0, 41.0, 30.0, 41.0, 60.0);
        this.setType(new Type[]{Type.NORMAL});
        this.setMove(new Move[]{new Thunder(), new Tackle(), new SandAttack()});

    }
}
