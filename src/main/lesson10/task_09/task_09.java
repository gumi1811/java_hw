package main.lesson10.task_09;

import java.util.LinkedList;

public class task_09 {
  public static void main(String[] args) {
    // Создание связного списка и добавление элементов
    LinkedList<String> list = new LinkedList<>();
    list.add("Первый");
    list.add("Второй");
    list.add("Третий");
    list.add("Второй");
    list.add("Четвертый");

    // Вывод исходного списка
    System.out.println("Исходный список: " + list);

    // Определяем искомый элемент
    String searchElement = "Второй";

    // Получение первого и последнего вхождения
    int firstIndex = list.indexOf(searchElement);
    int lastIndex = list.lastIndexOf(searchElement);

    // Вывод результатов
    System.out.println("Первое вхождение элемента '" + searchElement + "': " + firstIndex);
    System.out.println("Последнее вхождение элемента '" + searchElement + "': " + lastIndex);
  }
}
