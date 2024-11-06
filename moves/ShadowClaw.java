package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove{
    public ShadowClaw() {
        type = Type.GHOST;
        power = 70;
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
        return "применил Shadow Claw";
    }
}
