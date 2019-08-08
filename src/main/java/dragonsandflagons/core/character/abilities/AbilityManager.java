package dragonsandflagons.core.character.abilities;

import java.util.Map;

public class AbilityManager {

    private Map<AbilityType, Integer> abilityScores;

    public AbilityManager(Map<AbilityType, Integer> abilityScores) {
        this.abilityScores = abilityScores;
    }

    public int getScoreFor(String ability){
        return 0;
    }

}
