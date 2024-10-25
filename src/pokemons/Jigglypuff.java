package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.Swagger;
import attacks.Flamethrower;
import attacks.Body_slam;
public class Jigglypuff extends Igglybuff {
    public Jigglypuff (String name, int level){
        super(name,level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(115, 45, 20, 45, 25, 20);
        setMove(new Swagger(), new Flamethrower(), new Body_slam());
    }
}
