package dragonsandflagons.core.character.items.coinage;

public enum Coinage {
  COPPER("Copper", "cp", .01),
  SILVER("Silver", "sp", .10),
  ELECTRUM("Electrum", "ep", .5),
  GOLD("Gold", "gp", 1),
  PLATINUM("Platinum", "pp", 10);

  private String name;
  private String nickName;
  private double value;

  Coinage(String name, String nickName, double value) {
    this.name = name;
    this.nickName = nickName;
    this.value = value;
  }

  public static void main(String[] args) {
    Coinage gold = GOLD;
    System.out.println(gold.getValue());
  }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public double getValue() {
        return value;
    }
}
