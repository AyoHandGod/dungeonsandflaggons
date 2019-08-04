package dragonsandflagons.core.dice;

import dragonsandflagons.core.dice.Dice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DiceSteps {
  Dice d20;
  Dice d12;
  Dice d10;
  Dice d8;
  Dice d6;
  Dice d4;

  @Given("^I have a d20 dice object$")
  public void i_have_a_d20_dice_object() {
    d20 = new D20();
  }

//  @Given("^I have a d12 dice object$")
//  public void i_have_a_d12_dice_object() {
//      d12 = new D12();
//  }
//
//  @Given("^I have a d10 dice object$")
//  public void i_have_a_d10_dice_object() {
//      d10 = new D10();
//  }
//
//  @Given("^I have a d8 dice object$")
//  public void i_have_a_d8_dice_object() {
//      d8 = new D8();
//  }
//
//  @Given("^I have a d6 dice object$")
//  public void i_have_a_d6_dice_object() {
//      d6 = new D6();
//  }
//
//  @Given("^I have a d4 dice object$")
//  public void i_have_a_d4_dice_object() {
//      d4 = new D4();
//  }

  @When("^I roll it$")
  public void i_roll_it() {
    d20.rollDice();
//    d12.rollDice();
  }

  @Then("^the roll can never be lower than 1$")
  public void the_roll_can_never_be_lower_than_1() {
    Assert.assertFalse(d20.getFaceValue() < 1);
  }

  @And("^the roll can never be higher than 20$")
  public void the_roll_can_never_be_higher_than_20() {
    Assert.assertFalse(20 < d20.getFaceValue());
  }
}
