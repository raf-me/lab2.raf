package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(){
        type = Type.GROUND;
        power = 0;
        accuracy = 100;
        priority = 15;
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        p.setMod(Stat.ATTACK, 1);

    }
    @Override
    protected String describe(){
        return "Применил Sand Attack";
    }
}
