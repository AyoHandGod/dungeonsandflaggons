package dragonsandflagons.core.character.race;

public enum Alignment {
    LAWFUL_GOOD ("LG"), NEUTRAL_GOOD ("NG"), CHAOTIC_GOOD ("CG"), LAWFUL_NEUTRAL ("LN"), NEUTRAL ("N"),
    CHAOTIC_NEUTRAL ("CN"), LAWFUL_EVIL ("LE"), NEUTRAL_EVIL ("NE"), CHAOTIC_EVIL ("CE");

    private String aligment;

    Alignment(String alignment){
        this.aligment = alignment;
    }

    public String getAligment(){
        return aligment;
    }
}


