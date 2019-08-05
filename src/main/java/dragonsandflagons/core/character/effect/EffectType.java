package dragonsandflagons.core.character.effect;

public enum EffectType {
    PASSIVE ("Passive"), ACTIVE ("Active");

    private String type;

    EffectType(String type){
        this.type = type;
    }
}
