package main.lesson10.task_01;

public enum Colors {
  BLACK,
  WHITE,
  RED,
  GREEN,
  BLUE;

  public static void main(String[] args) {
    for (Colors color: Colors.values()) {
      System.out.println(color);
    }
  }
}
