import java.util.*;

public class PirateCounter{

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    System.out.println(pirateSeparator(pirates));


  }
  public static List pirateSeparator(List<Pirate> pirates) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).isHasWoodenLeg() && (pirates.get(i).getGold() > 15)) {
        list.add(pirates.get(i).getName());
       }
     }
     return list;
  }
}
