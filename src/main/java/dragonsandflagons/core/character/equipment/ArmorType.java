package dragonsandflagons.core.character.equipment;

public enum ArmorType {
    LIGHT ("Light"), MEDIUM ("Medium"), HEAVY ("Heavy");

    String armorType;

    ArmorType(String armorType){
        this.armorType = armorType;
    }

    public String getArmorType() {
        return this.armorType;
    }

  public static void main(String[] args) {
    //
      ArmorType armorType = ArmorType.HEAVY;
      System.out.println(armorType.getArmorType());

  }
}
