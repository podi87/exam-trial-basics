
public class Pirate {

  private String name;
  private boolean hasWoodenLeg;
  private int gold;

  public String getName() {
    return name;
  }
  public boolean isHasWoodenLeg() {
    return hasWoodenLeg;
  }
  public  int getGold() {
    return gold;
  }


  public Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }
}

