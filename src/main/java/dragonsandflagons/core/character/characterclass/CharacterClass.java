package dragonsandflagons.core.character.characterclass;

import dragonsandflagons.core.character.abilities.Ability;
import dragonsandflagons.core.character.equipment.ArmorType;
import dragonsandflagons.core.character.equipment.WeaponType;
import dragonsandflagons.core.dice.Dice;

import java.util.List;

public interface CharacterClass {

    public String getClassName();

    public String getDescription();

    public int getCharacterLevel();

    public int getCharacterXP();

    public int getProficienyBonus();

    public Dice getHitDie();

    public List<Ability> getPrimaryAbilities();

    public List<Ability> getSavingThrowProficiencies();

    public List<ArmorType> getArmorProficiencyList();

    public List<WeaponType> getWeaponProficiencyList();

   public default String classDetails() {
       String classDetails = "This character is a level " + getCharacterLevel() + " " + getClassName();
       return classDetails;
   }
}