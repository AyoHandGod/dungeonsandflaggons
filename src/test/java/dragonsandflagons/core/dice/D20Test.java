package dragonsandflagons.core.dice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class D20Test {

    @Test
    public void faceValueCantExceedTwenty(){
        Dice d20 = new D20();
        d20.rollDice();
        Assert.assertTrue(d20.getFaceValue() > 1 && d20.getFaceValue() < 21);
        System.out.println(d20.getFaceValue());
    }
}