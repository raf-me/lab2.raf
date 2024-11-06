package moves;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
    public Tackle(){
        type = Type.NORMAL;
        power = 40;
        accuracy = 110;
        priority = 35;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1);
    }
    @Override
    protected String describe(){
        return "Применил Tackle";
    }
}
