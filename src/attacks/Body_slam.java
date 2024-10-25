package attacks;
import ru.ifmo.se.pokemon.*;
public final class Body_slam extends PhysicalMove{
    public Body_slam(){super (Type.NORMAL, 85,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.PARALYZE));
    }
    @Override
    protected String describe(){
        return " использует Body Slam";
    }
}
