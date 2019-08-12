package dragonsandflagons.charactergenerator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CharacterSheetReaderSteps {

    CharacterSheetReader characterSheetReader;

    @Given("^I have a character sheet in pdf format$")
    public void i_have_a_character_sheet_in_pdf_format() {
        characterSheetReader = new CharacterSheetReaderSteps();
    }

    @When("^I pass it to the CharacterSheetParser$")
    public void i_pass_it_to_the_characterSheetParser() {

    }

    @Then("^I can get the fields that are required$")
    public void i_can_get_the_fields_that_are_required() {

    }
}
