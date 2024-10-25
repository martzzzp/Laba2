package attacks;
import ru.ifmo.se.pokemon.*;
public final class Psychic extends SpecialMove{
    public Psychic(){
        super(Type.PSYCHIC, 90, 100, 10, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return " использует Psychic";
    }
}
