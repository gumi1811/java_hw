package main.lesson12;

import java.util.Scanner;

// Напишите программу для замены всех символов 'a' на символы 'b'
public class task_06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку: ");
    String input = scanner.nextLine();

    // Замена всех 'a' на 'b'
    String output = input.replace('a', 'b');

    System.out.println("Результат: " + output);
    scanner.close();
  }
}
