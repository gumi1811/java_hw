package main.lesson11.task_02;

import java.util.Scanner;

// Профессор Смит, у которого вы работаете ассистентом, поделился с вами кодом, который он использует для автоматического
// оценивания работ студентов. В прошлом у него возникли некоторые проблемы с кодом при вводе общего возможного количества
// баллов за задание. Иногда он случайно вводит 0 для общего количества возможных баллов, и программа сталкивается
// с фатальной ошибкой при попытке разделить на 0. Чтобы решить эту проблему, напишите метод divide(),
// который принимает два параметра: x и y и возвращает результат: x/y. Однако, если y равно нулю, вы должны выбросить исключение.
// Если исключение будет отловлено, не забудьте вывести полезное сообщение.
public class task_02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Введите числитель: ");
      double numerator = scanner.nextDouble();
      System.out.print("Введите знаменатель: ");
      double denominator = scanner.nextDouble();

      try {
        double result = divide(numerator, denominator);
        System.out.printf("Результат деления: %.2f\n", result);
      } catch (ArithmeticException e) {
        System.out.println("Ошибка: " + e.getMessage());
      }

    } catch (IllegalArgumentException e) {
      System.out.println("Ошибка: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Неизвестная ошибка: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }

  public static double divide(double x, double y) {
    if (y == 0) {
      throw new ArithmeticException("Ошибка: Деление на ноль недопустимо.");
    }
    return x / y;
  }
}
