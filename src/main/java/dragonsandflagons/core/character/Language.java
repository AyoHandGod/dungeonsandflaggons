package dragonsandflagons.core.character;

import dragonsandflagons.core.character.race.RaceType;

import java.util.List;

public abstract class Language {
    private String name;
    private List<RaceType> typicalSpeakers;
    private RaceType script;

    protected Language(String name, List<RaceType> speakers, RaceType script){
        this.name = name;
        this.typicalSpeakers = speakers;
        this.script = script;
    }
}
