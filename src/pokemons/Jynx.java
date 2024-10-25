package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.Confide;
import attacks.Ice_Beam;
import attacks.Rest;
import attacks.Double_slap;
public final class Jynx extends Smoochum{
    public  Jynx (String name, int level){
        super(name,level);
        setType(Type.ICE, Type.PSYCHIC);
        setStats(65, 50, 35, 115,95,95);
        setMove(new Confide(), new Ice_Beam(), new Rest(), new Double_slap());
    }
}
