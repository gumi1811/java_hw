package main.lesson12;

import java.util.Scanner;

// Напишите программу для проверки того, является ли число положительным или отрицательным
public class task_05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число: ");
    double number = scanner.nextDouble();

    if (number > 0) {
      System.out.println("Число положительное.");
    } else if (number < 0) {
      System.out.println("Число отрицательное.");
    } else {
      System.out.println("Число равно нулю.");
    }

    scanner.close();
  }
}
