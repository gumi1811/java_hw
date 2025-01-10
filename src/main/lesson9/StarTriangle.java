package main.lesson9;

public class StarTriangle {
  int width;

  public StarTriangle(int width) {
    this.width = width;
  }

  public String toString() {
    String res;
    res = "";
    for (int i = 1; i <= width; i++) {
      for (int j = 1; j <= i; j++) {
        res = res + "[*]";
      }
      res = res + "\n";
    }
    return res;
  }

  public static void main(String[] args) {
    StarTriangle small = new StarTriangle(3);
    System.out.println(small.toString());
  }
}
