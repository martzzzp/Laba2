package attacks;
import ru.ifmo.se.pokemon.*;

public final class Earth_Power extends SpecialMove{
    public Earth_Power() {super (Type.GROUND, 90,100,10,1);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random()<0.1){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
        }
    @Override
    protected String describe() {
        return " использует Earth Power";

    }
}
