package dragonsandflagons.core.character.race;

public enum Alignment {
  LAWFUL_GOOD("LG"),
  NEUTRAL_GOOD("NG"),
  CHAOTIC_GOOD("CG"),
  LAWFUL_NEUTRAL("LN"),
  NEUTRAL("N"),
  CHAOTIC_NEUTRAL("CN"),
  LAWFUL_EVIL("LE"),
  NEUTRAL_EVIL("NE"),
  CHAOTIC_EVIL("CE");

  private String aligmentType;

  Alignment(String alignment) {
    this.aligmentType = alignment;
  }

  public String getAligmentType() {
    return aligmentType;
  }

  static Alignment fromString(String targetType) {
      for(Alignment alignment : Alignment.values()){
          if(alignment.getAligmentType().equalsIgnoreCase(targetType)){
              return alignment;
          }
      }
      return null;
  }

  public static void main(String[] args) {
      Alignment alignment = Alignment.fromString("LG");
      System.out.println(alignment);
  }
}
