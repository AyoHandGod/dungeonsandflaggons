package dragonsandflagons.core.character;

import dragonsandflagons.core.character.abilities.Ability;
import dragonsandflagons.core.character.characterclass.CharacterClass;
import dragonsandflagons.core.character.race.RaceType;
import dragonsandflagons.core.dice.Dice;
import jdk.internal.net.http.common.Pair;

import java.util.List;
import java.util.Map;

public abstract class Character {

    private RaceType raceType;
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

    public RaceType getRaceType() {
        return raceType;
    }

    public String getCharacterClass() {
        return characterClass.classDetails();
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return abilitiesScores.get(Ability.STRENGTH);
    }

    public int getDexterity() {
        return abilitiesScores.get(Ability.DEXTERITY);
    }

    public int getConstitution() {
        return abilitiesScores.get(Ability.CONSTITUTION);
    }

    public int getIntelligence() {
        return abilitiesScores.get(Ability.INTELLIGENCE);
    }

    public int getWisdom() {
        return abilitiesScores.get(Ability.WISDOM);
    }

    public int getCharsima() {
        return abilitiesScores.get(Ability.CHARISMA);
    }

    public String getSex() {
        return sex;
    }

    public Map<Ability, Integer> getAbilitiesScores() {
        return abilitiesScores;
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
