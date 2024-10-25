package attacks;
import ru.ifmo.se.pokemon.*;
public final class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100, 15, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.BURN));
    }
    @Override
    protected String describe(){
        return " использует Flamethrowe";
    }
}
