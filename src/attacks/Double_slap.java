package attacks;
import ru.ifmo.se.pokemon.*;
import java.util.Random;
public final class Double_slap extends PhysicalMove {
    public Double_slap() {
        super(Type.NORMAL, 15, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Random random = new Random();
        int chance = random.nextInt(8);
        if(chance == 0 | chance == 1 | chance == 2) {
            for(int i = 0; i < 2; i ++){
                pokemon.setMod(Stat.HP, 30);
            }
        }
        if(chance == 3 | chance == 4 | chance == 5) {
            for(int i = 0; i < 3; i ++){
                pokemon.setMod(Stat.HP, 45);
            }
        }
        if(chance == 6) {
            for(int i = 0; i < 4; i ++){
                pokemon.setMod(Stat.HP, 60);
            }
        }
        if(chance == 7) {
            for(int i = 0; i < 5; i ++){
                pokemon.setMod(Stat.HP, 75);
            }
        }
    }
    @Override
    protected String describe() {
        return " использует Double Slap";
    }
}
