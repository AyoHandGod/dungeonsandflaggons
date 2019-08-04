package dragonsandflagons.core.dice;

import dragonsandflagons.core.dice.behavior.StandardRollBehavior;

public class D12 extends Dice {
    public D12() {
        super(12, new StandardRollBehavior());
    }
}
