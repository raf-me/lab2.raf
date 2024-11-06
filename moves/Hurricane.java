package moves;

import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class Hurricane extends SpecialMove {
    public Hurricane() {
        type = Type.FLYING;
        power = 110;
        accuracy = 70;
        priority = 10;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        if (Main.chance(0.3)) {
            Effect.confuse(p);

        }
    }

    @Override
    protected String describe() {
        return "применил Hurricane";
    }
}
