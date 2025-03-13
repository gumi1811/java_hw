package main.lesson12;

// Напишите программу для суммирования значений массива
public class task_07 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5}; // Пример массива
    int sum = 0;

    for (int num : numbers) {
      sum += num;
    }

    System.out.println("Сумма элементов массива: " + sum);
  }
}
