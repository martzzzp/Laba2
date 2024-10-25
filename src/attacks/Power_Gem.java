package attacks;
import ru.ifmo.se.pokemon.*;
public final class Power_Gem extends SpecialMove {
    public Power_Gem () {super (Type.ROCK, 80, 20,100,1);
    }
    @Override
    protected String describe(){
        return " использует Power Gem";
    }
}
