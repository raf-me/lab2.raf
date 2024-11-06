package moves;


import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        type = Type.ELECTRIC;
        power = 110;
        accuracy = 70;
        priority = 10;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Main.chance(0.3)) {
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "Применил Thunder";
    }
}
