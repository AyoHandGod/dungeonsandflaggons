Feature: Dice
  These are the scenarios for the dice features

  Scenario: d20 dice can only roll between 1 and 20
    Given I have a d20 dice object
    When I roll it
    Then the roll can never be lower than 1
    And the roll can never be higher than 20

  Scenario: d12 dice can only roll between 1 and 12
    Given I have a d12 dice object
    When I roll it
    Then the roll can never be lower than 1
    And the roll can never be higher than 12

  Scenario: d10 dice can only roll between 1 and 10
    Given I have a d10 dice object
    When I roll it
    Then the roll can never be lower than 1
    And the roll can never be higher than 10

  Scenario: d8 dice can only roll between 1 and 8
    Given I have a d8 dice object
    When I roll it
    Then the roll can never be lower than 1
    And the roll can never be higher than 8

  Scenario: d6 dice can only roll between 1 and 6
    Given I have a d6 dice object
    When I roll it
    Then the roll can never be lower than 1
    And the roll can never be higher than 6

  Scenario: d4 dice can only roll between 1 and 4
    Given I have a d4 dice object
    When I roll it
    Then the roll can never be lower than 1
    And the roll can never be higher than 4