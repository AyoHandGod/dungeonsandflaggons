package dragonsandflagons.core.character.race;

import dragonsandflagons.core.character.Language;
import dragonsandflagons.core.character.abilities.AbilityType;
import dragonsandflagons.core.character.effect.traits.Trait;

import java.util.List;
import java.util.Map;

public abstract class Race {
    private RaceType raceType;
    private String raceName;
    private int ageLimit;
    private List<Alignment> typicalAlignments;
    private Size size;
    private int racialSpeed;
    private List<Language> typicalLanguages;
    private Map<AbilityType, Integer> abilityScoreIncrease;
    private List<Trait> racialTraits;

    public RaceType getRaceType() {
        return raceType;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public List<Alignment> getTypicalAlignments() {
        return typicalAlignments;
    }

    public Size getSize() {
        return size;
    }

    public int getSpeed() {
        return racialSpeed;
    }

    public List<Language> getTypicalLanguages() {
        return typicalLanguages;
    }

    public String getRaceName() {
        return this.raceName;
    }

    public int getAbilityScoreIncrease(AbilityType abilityType) {
        if(!abilityScoreIncrease.containsKey(abilityType)){
            return 0;
        }
        return abilityScoreIncrease.get(abilityType);
    }

    public List<Trait> getRacialTraits() {
        return this.racialTraits;
    }

}
