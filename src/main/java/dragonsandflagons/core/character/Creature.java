package dragonsandflagons.core.character;

import dragonsandflagons.core.character.abilities.AbilityType;
import dragonsandflagons.core.character.characterclass.CharacterClass;
import dragonsandflagons.core.character.race.Alignment;
import dragonsandflagons.core.character.race.Race;
import dragonsandflagons.core.dice.Dice;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Creature {

  private Race race;

  private String name;
  private String sex;
  private Map<AbilityType, Integer> abilitiesScores;

  private Alignment alignment;

  private List<Language> languages;

  private int armorClass;
  private int initiative;
  private int speed;

  private int currentHp;
  private int tempHp;
  private Entry<Integer, Dice> hitDice;

  private boolean alive;

}
