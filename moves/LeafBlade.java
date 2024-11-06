package moves;

import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove {
    public LeafBlade() {
        type = Type.GRASS;
        power = 90;
        accuracy = 100;
        priority = 15;
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d / 8d;
    }
    @Override
    protected String describe() {
        return "применил Leaf Blade";
    }
}
