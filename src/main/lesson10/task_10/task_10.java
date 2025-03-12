package main.lesson10.task_10;

import java.util.LinkedList;

public class task_10 {
  public static void main(String[] args) {
    // Создание связного списка и добавление элементов
    LinkedList<String> list = new LinkedList<>();
    list.add("Первый");
    list.add("Второй");
    list.add("Третий");
    list.add("Четвертый");
    list.add("Пятый");

    // Вывод исходного списка
    System.out.println("Исходный список: " + list);

    // Проверка наличия достаточного количества элементов
    if (list.size() > 3) {
      // Замена второго и четвертого элементов
      list.set(1, "Новый второй");
      list.set(3, "Новый четвертый");
    }

    // Вывод измененного списка
    System.out.println("Измененный список: " + list);
  }
}
