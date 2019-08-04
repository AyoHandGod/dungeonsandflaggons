package dragonsandflagons.core.dice;

import dragonsandflagons.core.dice.behavior.StandardRollBehavior;

/** The type D 20. */
public class D20 extends Dice {

  /** Instantiates a new D 20. */
  public D20() {
        super(20, new StandardRollBehavior());
    }

  public static void main(String[] args) {
    Dice d20 = new D20();
    for(int i = 0; i < 1000; i++){
        d20.rollDice();
        if(d20.getFaceValue() < 1){
            System.out.println("Test failed");
            System.out.println(d20.getFaceValue());
            break;
        } else if (d20.getFaceValue() == 1){
            System.out.println("Min roll!");
        }
    }
  }
}
