package main.lesson12;

import java.util.Scanner;

// Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
public class task_04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int num1 = scanner.nextInt();

    System.out.print("Введите второе число: ");
    int num2 = scanner.nextInt();

    System.out.print("Введите третье число: ");
    int num3 = scanner.nextInt();

    int max = Math.max(num1, Math.max(num2, num3));

    System.out.println("Наибольшее число: " + max);

    scanner.close();
  }
}
