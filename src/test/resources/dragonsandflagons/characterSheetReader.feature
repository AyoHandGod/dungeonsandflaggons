Feature: Character Sheet Reader

Scenario: Character sheet pdf can be parsed
Given I have a character sheet in pdf format
When I pass it to the CharacterSheetParser
Then I can get the fields that are required
