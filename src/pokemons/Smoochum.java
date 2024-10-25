package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.Confide;
import attacks.Ice_Beam;
import attacks.Rest;
public class Smoochum extends Pokemon{
    public Smoochum (String name, int level){
        super(name, level);
        setType(Type.ICE, Type.PSYCHIC);
        setStats(45, 30, 15, 85, 65, 65);
        setMove(new Confide(), new Ice_Beam(), new Rest());
    }
}
