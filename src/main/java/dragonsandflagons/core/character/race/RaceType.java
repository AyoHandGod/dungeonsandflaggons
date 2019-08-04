package dragonsandflagons.core.character.race;

public enum RaceType {
    DWARF ("Dwarf"), ELF ("Elf"), HUMAN ("Human"), HALFLING ("Halfling"), DRAGONBORN ("Dragonborn"),
    GNOME ("Gnome"), HALF_ELF ("Half-Elf"), HALF_ORC ("Half-Orc"), TIEFLING ("Tiefling");

    private String race;

    RaceType(String race){
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }
}
