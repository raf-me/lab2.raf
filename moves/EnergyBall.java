package moves;

import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        type = Type.GRASS;
        power = 90;
        accuracy = 100;
        priority = 10;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Main.chance(0.1)) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "применил EnergyBall";
    }
}
