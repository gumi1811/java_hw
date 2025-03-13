package test;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    try {
      int i = 1;
      int j = i + 3;
      System.out.println("Значение " + j);
    } catch (Exception e) {
      System.out.println("Ошибка!");
    }
  }
}