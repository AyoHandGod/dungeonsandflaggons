package dragonsandflagons.core.character.characterclass;

import dragonsandflagons.core.character.abilities.AbilityType;
import dragonsandflagons.core.character.items.armor.ArmorType;
import dragonsandflagons.core.character.items.weapon.WeaponType;
import dragonsandflagons.core.dice.Dice;

import java.util.List;

public interface CharacterClass {

    public String getClassName();

    public String getDescription();

    public int getCharacterLevel();

    public int getCharacterXP();

    public int getProficienyBonus();

    public Dice getHitDie();

    public List<AbilityType> getPrimaryAbilities();

    public List<AbilityType> getSavingThrowProficiencies();

    public List<ArmorType> getArmorProficiencyList();

    public List<WeaponType> getWeaponProficiencyList();

   public default String classDetails() {
       String classDetails = "This character is a level " + getCharacterLevel() + " " + getClassName();
       return classDetails;
   }
}