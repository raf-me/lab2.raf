package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        type = Type.NORMAL;
        power = 70;
        accuracy = 100;
        priority = 20;
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        super.applyOppDamage(pokemon, damage);

        Status status = pokemon.getCondition();

        if (status.equals(Status.PARALYZE) || status.equals(Status.BURN) || status.equals(Status.POISON)) {
            super.applyOppDamage(pokemon, damage);
            super.applyOppDamage(pokemon, damage);
        }
    }
    @Override
    protected String describe() {
        return "применил Facade";
    }
}