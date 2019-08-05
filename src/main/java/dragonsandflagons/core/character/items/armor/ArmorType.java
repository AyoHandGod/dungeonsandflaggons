package dragonsandflagons.core.character.items.armor;

public enum ArmorType {
    LIGHT ("Light"), MEDIUM ("Medium"), HEAVY ("Heavy");

    String armorType;

    ArmorType(String armorType){
        this.armorType = armorType;
    }

    public String getArmorType() {
        return this.armorType;
    }

}
