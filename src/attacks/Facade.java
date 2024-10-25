package attacks;
import ru.ifmo.se.pokemon.*;
public final class Facade extends PhysicalMove{ //родитель моего класса фасад это физикал мув
    public Facade() {super (Type.NORMAL, 70, 100);} //атаки вызываем методами у покемонов; конструктор!!

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) { //переопределили метод родительского класса = метод форматирую под свои нужды
        super.applyOppDamage(pokemon, damage); //super - из родительского класса (ссылка на объект из родительского класса), указываю на аргументы, которые я написала в переопределении метода
        if (pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.POISON || pokemon.getCondition() == Status.PARALYZE) {
            super.applyOppDamage(pokemon, damage);
        }
    }
    @Override //по факту могу этот метод не писать, но потом у меня не будет никакого текста
    protected String describe(){
        return " использует Facade, сила удваивается, если использующий обожжен, отравлен или парализован";
    }
}
