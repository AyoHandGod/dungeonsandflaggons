package dragonsandflagons.core.character.abilities;

import dragonsandflagons.util.dice.Dice;

import java.util.Map;

public class AbilityManagerBuilder {
    private Map<AbilityType, Integer> abilityScores;

    public AbilityManagerBuilder setAbilityScores(Map<AbilityType, Integer> abilityScores) {
        this.abilityScores = abilityScores;
        return this;
    }

    public static int[] rollAbilityScoreOptions() {
        Dice dice = new Dice();
        int[] scores = new int[6];

        for(int i = 0; i < scores.length; i++){
            int[] rollResults = new int[3];

            int lowest = 0;
            int lowest_index = 0;

            for(int j = 0; j < rollResults.length; j++){
                dice.rollDice();
                if(lowest == 0 || dice.getFaceValue() < lowest){
                    lowest = dice.getFaceValue();
                    lowest_index = j;
                }
                rollResults[j] = dice.getFaceValue();
            }

            dice.rollDice();
            if(rollResults[lowest_index] < dice.getFaceValue()){
                rollResults[lowest_index] = dice.getFaceValue();
            }

            for(int values: rollResults){
                scores[i] += values;
            }
        }

        return scores;
    }


    public AbilityManager createAbilityManager() {
        return new AbilityManager(abilityScores);
    }

  public static void main(String[] args) {
     int[] scores = rollAbilityScoreOptions();
     for(int score: scores){
         System.out.println(score);
     }
  }
}