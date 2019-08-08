package dragonsandflagons.core.character.characterclass;

import dragonsandflagons.core.character.abilities.AbilityType;
import dragonsandflagons.core.character.items.armor.ArmorType;
import dragonsandflagons.core.character.items.weapon.WeaponType;
import dragonsandflagons.core.dice.Dice;

import java.util.List;

public class Barbarian implements CharacterClass {

    private String className;
    private String description;
    private int characterLevel;
    private int characterXP;
    private int proficienyBonus;

    private Dice hitDie;
    private List<AbilityType> primaryAbilities;
    private List<AbilityType> savingThrowProficiencies;
    private List<ArmorType> armorProficiencyList;
    private List<WeaponType> weaponProficiencyList;

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCharacterLevel() {
        return characterLevel;
    }

    @Override
    public int getCharacterXP() {
        return characterXP;
    }

    @Override
    public int getProficienyBonus() {
        return proficienyBonus;
    }

    @Override
    public Dice getHitDie() {
        return hitDie;
    }

    @Override
    public List<AbilityType> getPrimaryAbilities() {
        return primaryAbilities;
    }

    @Override
    public List<AbilityType> getSavingThrowProficiencies() {
        return savingThrowProficiencies;
    }

    @Override
    public List<ArmorType> getArmorProficiencyList() {
        return armorProficiencyList;
    }

    @Override
    public List<WeaponType> getWeaponProficiencyList() {
        return weaponProficiencyList;
    }
}
