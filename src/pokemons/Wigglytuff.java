package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.Swagger;
import attacks.Flamethrower;
import attacks.Body_slam;
import attacks.Psychic;
public final class Wigglytuff extends Jigglypuff{
    public Wigglytuff (String name, int level){
        super (name, level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(140, 70, 45, 85, 50, 45);
        setMove(new Swagger(), new Flamethrower(), new Body_slam(), new Psychic());
    }
}
