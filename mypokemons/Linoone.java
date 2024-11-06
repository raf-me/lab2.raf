package mypokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Linoone extends Pokemon{
    public Linoone(String name, int lvl) {
        super(name, lvl);
        this.setStats(78.0, 70.0, 61.0, 50.0, 61.0, 100.0);
        this.setType(new Type[]{Type.NORMAL});
        this.setMove(new Move[]{new Thunder(), new Tackle(), new SandAttack(), new ShadowClaw()});
    }
}
