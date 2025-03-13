package main.lesson12;

import java.util.Scanner;

// Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
public class task_01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ввод двух чисел
    System.out.print("Введите первое число: ");
    double num1 = scanner.nextDouble();

    System.out.print("Введите второе число: ");
    double num2 = scanner.nextDouble();

    // Выполнение арифметических операций
    double sum = num1 + num2;
    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = (num2 != 0) ? num1 / num2 : Double.NaN;
    double remainder = (num2 != 0) ? num1 % num2 : Double.NaN;

    // Вывод результатов
    System.out.println("Сумма: " + sum);
    System.out.println("Разность: " + difference);
    System.out.println("Произведение: " + product);
    System.out.println("Частное: " + (Double.isNaN(quotient) ? "деление на ноль невозможно" : quotient));
    System.out.println("Остаток: " + (Double.isNaN(remainder) ? "деление на ноль невозможно" : remainder));

    scanner.close();
  }
}
