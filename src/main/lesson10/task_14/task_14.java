package main.lesson10.task_14;

import java.util.HashMap;

public class task_14 {
  public static void main(String[] args) {
    // Создание HashMap и добавление элементов
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Один");
    map.put(2, "Два");
    map.put(3, "Три");

    // Значение для проверки
    String searchValue = "Два";

    // Проверка наличия значения в HashMap
    if (map.containsValue(searchValue)) {
      System.out.println("HashMap содержит значение: " + searchValue);
    } else {
      System.out.println("HashMap не содержит значение: " + searchValue);
    }
  }
}
