package moves;

import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        type = Type.GHOST;
        power = 80;
        accuracy = 100;
        priority = 15;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Main.chance(0.2)) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        }

    }

    @Override
    protected String describe() {
        return "применил Shadow Ball";
    }
}
