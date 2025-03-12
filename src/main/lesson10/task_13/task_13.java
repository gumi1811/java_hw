package main.lesson10.task_13;

import java.util.HashMap;

public class task_13 {
  public static void main(String[] args) {
    // Создание первой HashMap и добавление элементов
    HashMap<Integer, String> map1 = new HashMap<>();
    map1.put(1, "Один");
    map1.put(2, "Два");
    map1.put(3, "Три");

    // Создание второй HashMap
    HashMap<Integer, String> map2 = new HashMap<>();

    // Копирование всех записей из map1 в map2
    map2.putAll(map1);

    // Вывод результатов
    System.out.println("Первая HashMap: " + map1);
    System.out.println("Вторая HashMap (после копирования): " + map2);
  }
}
