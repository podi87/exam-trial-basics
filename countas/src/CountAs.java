import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountAs {

  static String FILE_NAME = "afile.txt";
  static Path path = Paths.get(FILE_NAME);
  static List<String> fileContains;
  public static void main(String[] args) {

    System.out.println(aCounter(FILE_NAME));

  }
  public static int aCounter(String fileName) {
    Path path = Paths.get(fileName);
    fileContains = new ArrayList<String>();
    try {
      fileContains = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
    }
    String string = fileContains.toString();
    if (string.length() == 0) {
      return 0;
    } else {
      String a = "a";
      int numberOfAs = 0;
      for (int i = 0; i < string.length(); i++) {
        if (a.equals(string.substring(i, i+1))) {
          numberOfAs++;
        }
      }
      return numberOfAs;
    }
  }
}
