package main.lesson10.task_08;

import java.util.ArrayList;

public class task_08 {
  public static void main(String[] args) {
    // Создание списка и добавление элементов
    ArrayList<String> list = new ArrayList<>();
    list.add("Первый");
    list.add("Второй");
    list.add("Третий");

    // Вывод исходного списка
    System.out.println("Исходный список: " + list);

    // Замена второго элемента (индекс 1)
    if (list.size() > 1) {
      list.set(1, "Новый элемент");
    }

    // Вывод измененного списка
    System.out.println("Измененный список: " + list);
  }
}
