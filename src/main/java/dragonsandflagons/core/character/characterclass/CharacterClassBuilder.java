package dragonsandflagons.core.character.characterclass;

import dragonsandflagons.core.character.abilities.Ability;
import dragonsandflagons.core.character.equipment.ArmorType;
import dragonsandflagons.core.character.equipment.WeaponType;
import dragonsandflagons.core.dice.Dice;

import java.util.List;

public class CharacterClassBuilder {
    private String className;
    private String description;
    private int characterLevel;
    private int characterXP;
    private int proficienyBonus;
    private Dice hitDie;
    private List<Ability> primaryAbilities;
    private List<Ability> savingThrowProficiencies;
    private List<ArmorType> armorProficiencyList;
    private List<WeaponType> weaponProficiencyList;

    public CharacterClassBuilder setClassName(String className) {
        this.className = className;
        return this;
    }

    public CharacterClassBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public CharacterClassBuilder setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
        return this;
    }

    public CharacterClassBuilder setCharacterXP(int characterXP) {
        this.characterXP = characterXP;
        return this;
    }

    public CharacterClassBuilder setProficienyBonus(int proficienyBonus) {
        this.proficienyBonus = proficienyBonus;
        return this;
    }

    public CharacterClassBuilder setHitDie(Dice hitDie) {
        this.hitDie = hitDie;
        return this;
    }

    public CharacterClassBuilder setPrimaryAbilities(List<Ability> primaryAbilities) {
        this.primaryAbilities = primaryAbilities;
        return this;
    }

    public CharacterClassBuilder setSavingThrowProficiencies(List<Ability> savingThrowProficiencies) {
        this.savingThrowProficiencies = savingThrowProficiencies;
        return this;
    }

    public CharacterClassBuilder setArmorProficiencyList(List<ArmorType> armorProficiencyList) {
        this.armorProficiencyList = armorProficiencyList;
        return this;
    }

    public CharacterClassBuilder setWeaponProficiencyList(List<WeaponType> weaponProficiencyList) {
        this.weaponProficiencyList = weaponProficiencyList;
        return this;
    }

}