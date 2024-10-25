package attacks;
import ru.ifmo.se.pokemon.*;
public final class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0, 20, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe() {
        return " использует Confide";
    }
}

