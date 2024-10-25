package attacks;
import ru.ifmo.se.pokemon.*;
public final class Swagger extends StatusMove{
    public Swagger (){super (Type.NORMAL, 0, 85,15,1);}

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().stat(Stat.ATTACK, 2));
        pokemon.confuse();
        }
    @Override
    protected String describe(){
        return " использует Swagger";
    }
}
