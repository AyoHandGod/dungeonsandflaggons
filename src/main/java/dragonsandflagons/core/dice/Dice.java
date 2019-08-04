package dragonsandflagons.core.dice;

import dragonsandflagons.core.dice.behavior.RollBehavior;
import dragonsandflagons.core.dice.behavior.StandardRollBehavior;

import java.util.Random;

public abstract class Dice {

    private RollBehavior rollBehavior;
    private int sides;
    private int faceValue;

    public Dice() {
        sides = 6;
        rollBehavior = new StandardRollBehavior();
    }

    public Dice(int sides) {
        this.sides = sides;
        rollBehavior = new StandardRollBehavior();
    }

    public Dice(int sides, RollBehavior rollBehavior){
        this.sides = sides;
        this.rollBehavior = rollBehavior;
    }

    public void rollDice() {
        faceValue = rollBehavior.roll(this.sides);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setRollBehavior(RollBehavior rollBehavior) {
        this.rollBehavior = rollBehavior;
    }
}
