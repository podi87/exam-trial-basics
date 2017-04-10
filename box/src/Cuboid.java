
public class Cuboid {
  int a;
  int b;
  int c;

  public static void main(String[] args) {
    System.out.println(getSurface(5,5,5));
    System.out.println(getVolume(5,5,5));

  }

  public static int getSurface (int a, int b, int c) {
    int surface = 2 *((a*b) + (a*c) + (b*c));
    return surface;
  }

  public static int getVolume (int a, int b, int c) {
    int volume = a * b * c;
    return volume;
  }
}
