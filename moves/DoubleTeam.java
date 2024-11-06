package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        type = Type.NORMAL;
        power = 0;
        accuracy = 0;
        priority = 15;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe(){
        return "применил Double Team";
    }
}
