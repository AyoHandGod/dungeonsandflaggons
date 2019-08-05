package dragonsandflagons.core.character;

import dragonsandflagons.core.character.abilities.Ability;
import dragonsandflagons.core.character.characterclass.CharacterClass;
import dragonsandflagons.core.character.race.Alignment;
import dragonsandflagons.core.character.race.Race;
import dragonsandflagons.core.dice.Dice;
import jdk.internal.net.http.common.Pair;

import java.util.List;
import java.util.Map;

public class Character {

  private Race race;
  private CharacterClass characterClass;

  private String name;
  private String sex;
  private Map<Ability, Integer> abilitiesScores;

  private String background;
  private Alignment alignment;
  private List<String> personalityTraits;
  private List<String> ideals;
  private List<String> bonds;
  private List<String> flaws;

  private String height;
  private int weight;
  private List<String> additionFeatures;
  private List<Language> languages;

  private int armorClass;
  private int initiative;
  private int speed;

  private int currentHp;
  private int tempHp;
  private Pair<Integer, Dice> hitDice;

  private boolean alive;

  // Getters
  public Race getRace() {
    return this.race;
  }

  public String getCharacterClass() {
    return characterClass.classDetails();
  }

  public String getName() {
    return name;
  }

  public int getStrength() {
    return getAbilitiesScore(Ability.STRENGTH);
  }

  public int getDexterity() {
    return getAbilitiesScore(Ability.DEXTERITY);
  }

  public int getConstitution() {
    return getAbilitiesScore(Ability.CONSTITUTION);
  }

  public int getIntelligence() {
    return getAbilitiesScore(Ability.INTELLIGENCE);
  }

  public int getWisdom() {
    return getAbilitiesScore(Ability.WISDOM);
  }

  public int getCharsima() {
    return getAbilitiesScore(Ability.CHARISMA);
  }

  public String getSex() {
    return sex;
  }

  public int getAbilitiesScore(Ability ability) {
    return abilitiesScores.get(ability);
  }

  public String getBackground() {
    return background;
  }

  public Alignment getAlignment() {
    return alignment;
  }

  public List<String> getPersonalityTraits() {
    return personalityTraits;
  }

  public List<String> getIdeals() {
    return ideals;
  }

  public List<String> getBonds() {
    return bonds;
  }

  public List<String> getFlaws() {
    return flaws;
  }

  public String getHeight() {
    return height;
  }

  public int getWeight() {
    return weight;
  }

  public List<String> getAdditionFeatures() {
    return additionFeatures;
  }

  public List<Language> getLanguages() {
    return languages;
  }

  public int getArmorClass() {
    return armorClass;
  }

  public int getInitiative() {
    return initiative;
  }

  public int getSpeed() {
    return speed;
  }

  public int getCurrentHp() {
    return currentHp;
  }

  public int getTempHp() {
    return tempHp;
  }

  public Pair<Integer, Dice> getHitDice() {
    return hitDice;
  }

  public boolean isAlive() {
    return alive;
  }
}
