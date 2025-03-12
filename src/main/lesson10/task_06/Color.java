package main.lesson10.task_06;

import java.util.ArrayList;

public class Color {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("green");
    colors.forEach(t -> {
      System.out.println(t);
    });
  }
}
