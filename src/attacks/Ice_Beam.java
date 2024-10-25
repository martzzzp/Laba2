package attacks;
import ru.ifmo.se.pokemon.*;
public final class Ice_Beam extends SpecialMove{
    public Ice_Beam() {super (Type.ICE, 90,100, 10,1);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) { //будет выполняться тогда и только тогда, когда входит в те самые 10%
       pokemon.addEffect(new Effect(). chance(0.1).condition(Status.FREEZE));
    }
    @Override
    protected String describe(){
        return " использует Ice Beam";
    }
}
