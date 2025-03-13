package main.lesson11.task_03;

import java.util.Scanner;
import java.util.StringTokenizer;

// Напишите программу, которая запрашивает, считывает строку ввода и анализирует целое число из каждой лексемы по мере ее извлечения.
// Программа суммирует целые числа и печатает сумму. Если вы передадите ей входные данные "10 20 30 40", она должна
// вывести "Сумма целых чисел в строке равна 100". Попробуйте и другие входы, например строку, содержащую как целые числа,
// так и другие значения, "2 rabbit 1 cat". Ошибки должны быть отловлены и корректно обработаны.
public class task_03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String input = scanner.nextLine();
    scanner.close();

    int sum = 0;
    StringTokenizer tokenizer = new StringTokenizer(input);

    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      try {
        int number = Integer.parseInt(token);
        sum += number;
      } catch (NumberFormatException e) {
        // Игнорируем нечисловые значения
      }
    }

    System.out.println("Сумма целых чисел в строке равна " + sum);
  }
}
