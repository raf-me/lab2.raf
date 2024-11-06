package moves;

import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove{
    public AncientPower() {
        type = Type.ROCK;
        power = 60;
        accuracy = 100;
        priority = 5;
    }

    @Override
    protected void applyOppEffects (Pokemon p){
        super.applyOppEffects(p);

        if (Main.chance(0.1)) {
            p.setMod(Stat.ATTACK, 1);
            p.setMod(Stat.DEFENSE, 1);
            p.setMod(Stat.SPECIAL_ATTACK, 1);
            p.setMod(Stat.SPECIAL_DEFENSE, 1);
            p.setMod(Stat.SPEED, 1);
        }
    }
    @Override
    protected String describe() {
        return "применил Ancient Power";
    }
}
