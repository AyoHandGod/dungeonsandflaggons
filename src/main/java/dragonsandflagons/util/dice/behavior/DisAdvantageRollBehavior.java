package dragonsandflagons.util.dice.behavior;

import java.util.Random;

public class DisAdvantageRollBehavior implements RollBehavior {

    @Override
    public int roll(int diceSides) {
        Random random = new Random();
        int firstRoll = random.nextInt(diceSides) + 1;
        int secondRoll = random.nextInt(diceSides) + 1;
        if(firstRoll < secondRoll){
            return firstRoll;
        }
        return secondRoll;
    }
}
