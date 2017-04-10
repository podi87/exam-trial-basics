import java.util.*;

public class PirateCounter{

  static List<String> list;

  static class Pirate {
    static String name;
    static boolean hasWoodenLeg;
    static int gold;

   public Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    System.out.println(pirateSeparator(pirates));


  }
  public static List pirateSeparator (ArrayList<Pirate> pirates) {
    list = new ArrayList<>();
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).equals((Pirate.hasWoodenLeg == true && Pirate.gold > 15))){
        list.add(pirates.get(i).toString());
       }
     }
     return list;
  }
}
