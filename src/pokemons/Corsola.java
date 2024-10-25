package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.Facade;
import attacks.Ice_Beam;
import attacks.Power_Gem;
import attacks.Earth_Power;
public final class Corsola extends Pokemon { //родительский класс Корсолы - покемон
    public Corsola (String name, int level){ //создаю конструктор
        super(name, level); //конструктор задает имя и уровень покемона от родительского класса
        setType(Type.WATER, Type.ROCK); //установили тип
        setStats(65,55,95,65,95,35); //установили характеристики
        setMove(new Facade(), new Ice_Beam(), new Power_Gem(), new Earth_Power());
    }
}
