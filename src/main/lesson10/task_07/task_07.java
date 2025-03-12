package main.lesson10.task_07;

import java.util.ArrayList;
import java.util.Arrays;

public class task_07 {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

    System.out.println("list1 и list2 равны: " + list1.equals(list2)); // true
  }
}
