package dragonsandflagons.core.dice.behavior;

import java.util.Random;

public class StandardRollBehavior implements RollBehavior {

  @Override
  public int roll(int sides) {
      return new Random().nextInt(sides) + 1;
  }
}
