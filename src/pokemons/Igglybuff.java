package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.Swagger;
import attacks.Flamethrower;
public class Igglybuff extends Pokemon {
    public Igglybuff (String name, int level){
        super (name, level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(90, 30,15,40,20,15);
        setMove(new Swagger(), new Flamethrower());
    }
}
