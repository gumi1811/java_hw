package main.lesson10.task_12;

import java.util.HashSet;

public class task_12 {
  public static void main(String[] args) {
    // Создание HashSet
    HashSet<String> set = new HashSet<>();

    // Проверка, пуст ли HashSet
    if (set.isEmpty()) {
      System.out.println("HashSet пустой.");
    } else {
      System.out.println("HashSet содержит элементы: " + set);
    }

    // Добавление элементов и повторная проверка
    set.add("Один");
    set.add("Два");

    if (set.isEmpty()) {
      System.out.println("HashSet пустой.");
    } else {
      System.out.println("HashSet содержит элементы: " + set);
    }
  }
}
