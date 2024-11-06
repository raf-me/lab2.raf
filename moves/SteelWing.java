package moves;

import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove{
    public SteelWing() {
        type = Type.STEEL;
        power = 70;
        accuracy = 90;
        priority = 25;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Main.chance(0.1)) {
            p.setMod(Stat.DEFENSE, 1);
        }
    }
    @Override
    protected String describe() {
        return "применил SteelWing";
    }
}
