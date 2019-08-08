package dragonsandflagons.core.character.moster;

public enum MonsterType {
    ABERRATION ("Aberration"), BEAST ("Beast"), CELESTIAL ("Celestial"), CONSTRUCT ("Construct"),
    DRAGON ("Dragon"), ELEMENTAL ("Elemental"), FEY ("Fey"), FIEND ("Fiend"), GIANT ("Giant"),
    HUMANOID ("Humanoid"), MONSTROSITY ("Monstrosity"), OOZE ("Ooze"), PLANT ("Plant"),
    UNDEAD ("Undead");

    private String name;

    MonsterType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    MonsterType getTypeFrom(String type){
        for(MonsterType monsterType: MonsterType.values()) {
            if(monsterType.getName().equalsIgnoreCase(type)){
                return monsterType;
            }
        }
        return null;
    }
}
