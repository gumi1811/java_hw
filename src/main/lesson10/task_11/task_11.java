package main.lesson10.task_11;

import java.util.HashSet;

public class task_11 {
  public static void main(String[] args) {
    // Создание двух HashSet
    HashSet<String> set1 = new HashSet<>();
    set1.add("Один");
    set1.add("Два");
    set1.add("Три");
    set1.add("Четыре");

    HashSet<String> set2 = new HashSet<>();
    set2.add("Три");
    set2.add("Четыре");
    set2.add("Пять");
    set2.add("Шесть");

    // Создание нового HashSet для хранения общих элементов
    HashSet<String> commonElements = new HashSet<>(set1);
    commonElements.retainAll(set2);

    // Вывод результатов
    System.out.println("Элементы, общие для обоих HashSet: " + commonElements);
  }
}
