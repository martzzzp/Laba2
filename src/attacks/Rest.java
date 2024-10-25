package attacks;
import ru.ifmo.se.pokemon.*;
public final class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0, 5, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(2);
        pokemon.restore();
        e.sleep(pokemon);
        System.out.println(pokemon.toString() + " засыпает на два хода");
    }

    @Override
    protected String describe() {
        return " использует атаку ";
    }
}
