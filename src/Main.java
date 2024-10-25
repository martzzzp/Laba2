import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Corsola p1 = new Corsola("Corsola", 10);
        Igglybuff p2 = new Igglybuff("Igglybuff", 10);
        Jigglypuff p3 = new Jigglypuff("Jigglypuff", 10);
        Jynx p4 = new Jynx("Jynx", 10);
        Smoochum p5 = new Smoochum("Smoochum", 10);
        Wigglytuff p6 = new Wigglytuff("Wigglytuff", 10);
        Pokemon [] pokemonList = {p1, p2, p3, p4, p5, p6};
        for (int i = 0; i < pokemonList.length; i++){
            if (i < pokemonList.length/2){
                b.addAlly(pokemonList[i]);}
            else{
                b.addFoe(pokemonList[i]);
            }
        }
        b.go();
    }
}

