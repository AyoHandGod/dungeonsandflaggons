package dragonsandflagons.core.character.effect;

public interface Effect {

    public EffectType getEffectType();
    public void setEffectType(EffectType effectType);
    public void activateEffect();
}
