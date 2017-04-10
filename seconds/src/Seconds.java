import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {

  static List<Integer> initial;

  public static void main(String[] args) {

   initial = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
   System.out.println(listMethod(initial));

  }
  public static List<Integer> listMethod (List<Integer> initial) {
    List<Integer> res = new ArrayList<>();
    for (int i = 1; i < initial.size(); i = i + 2) {
      res.add(initial.get(i));
    }
    return res;
  }
}
