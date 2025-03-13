package main.lesson11.task_01;

import java.util.Scanner;

// Напишите программу, которая будет запрашивать у пользователя вещественное число и выводить его квадратный корень.
// Ошибки должны быть отловлены с помощью блока try-catch.
public class task_01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Введите вещественное число: ");
      double num = scanner.nextDouble();
      if (num < 0) {
        throw new IllegalArgumentException("Нельзя извлекать квадратный корень из отрицательного числа.");
      }
      System.out.printf("Квадратный корень из %.2f равен %.2f\n", num, Math.sqrt(num));
    } catch (IllegalArgumentException e) {
      System.out.println("Ошибка: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Неизвестная ошибка: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
