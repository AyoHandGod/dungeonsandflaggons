package dragonsandflagons.core.character.race;

public enum Size {
    SMALL ("Small"), MEDIUM ("Medium"), LARGE ("Large"), GARGANTUAN ("Gargantuan");

    String size;

    Size(String size){
        this.size = size;
    }

  public static void main(String[] args) {
    //
      Size size = Size.valueOf("SMALL");
      System.out.println(size);

  }
}
