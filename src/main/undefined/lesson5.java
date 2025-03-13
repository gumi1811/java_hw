package main.undefined;

public class lesson5 {
  public static void main(String[] args) {

    // 1. Напишите программу, чтобы проверить значения длины и ширины прямоугольника и определить, является ли он квадратным или нет.
    int lenght = 10;
    int width = 6;
    if (lenght == width) {
      System.out.println("является квадратом");
    } else {
      System.out.println("является прямоугольником");
    }

    // 2. Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
    // Если стоимость товара ниже 5000, то стоимость остается без изменений.
    // Вычислите и выведите итоговую стоимость покупки для пользователя.
    double price = 6000;
    if (price > 5000) {
      price = price - price * 0.1;
    }
    System.out.println(price);

    /*
    3. В университете существуют следующие правила для системы оценок:
     Ниже 25 - F
     От 25 до 45 - E
     От 45 до 50 - D
     От 50 до 60 - C
     От 60 до 80 - B
     Выше 80 - A
     Создайте переменную grade и напечатайте в консоль соответствующую оценку в зависимости от значения переменной.
     */
    int grade = 90;
    if (grade < 25) {
      System.out.println("grade: F");
    } else if (grade < 45) {
      System.out.println("grade : E");
    } else if (grade < 50) {
      System.out.println("grade: D");
    } else if (grade < 60) {
      System.out.println("grade : C");
    } else if (grade < 80) {
      System.out.println("grade: B");
    } else {
      System.out.println("grade : A");
    }

    /*
     4. Дано целое положительное число. Напишите программу, которая выводит это число в обратном порядке.
       Например, если дано число 12345, то вывод будет следующим: 54321.
     */
    int number = 12345;
    int reversedNumber = 0;
    while (number != 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number = number / 10;
    }
    System.out.println("Число в обратном порядке: " + reversedNumber);

    /*
    5. Дано целое положительное число.
     Напишите программу, которая выводит сообщение о том, является ли это число простым.
     */
    int num = 13;
    boolean is_simple = true;
    if (num < 2) {
      is_simple = false;
    } else {
      for (int i = 2; i < number / 2; i++) {
        if (number % i == 0) {
          is_simple = false;
          break;
        }
      }
    }
    if (is_simple == true) {
      System.out.println("Простое число");
    } else {
      System.out.println("Не простое число");
    }

    /*
    5. 6. Напишите программу для печати следующего сообщения:
i)
**********
**********
**********
**********
ii)
*
**
***
****
*****
iii)
        1
      212
    32123
  4321234
543212345
     */
    System.out.println("i)\n" +
      "\n" +
      "**********\n" +
      "**********\n" +
      "**********\n" +
      "**********\n" +
      "ii)\n" +
      "\n" +
      "*\n" +
      "**\n" +
      "***\n" +
      "****\n" +
      "*****\n" +
      "iii)\n" +
      "\n" +
      "        1\n" +
      "      212\n" +
      "    32123\n" +
      "  4321234\n" +
      "543212345");


    /*
    7. Даны два целых числа a и b. Напишите программу для вычисления суммы натуральных чисел в диапазоне от a до b.
    */
    int a = 2;
    int b = 4;
    int sum = 0;
    for (int i = a; i <= b; i++) {
      sum = sum + i;
    }
    System.out.println(sum);

    /*
    8. В компании прошла аттестация по компетенциям и навыкам сотрудников. Даны зарплата и класс сотрудника. Напишите программу, чтобы определить сумму премии в зависимости от класса сотрудника. Необходимо создать переменную со значением зарплаты сотрудника, вывести в консоль результирующую зарплату с премией.

Бонусы в зависимости от класса:

Класс A: 50%
Класс B: 25%
Класс C: 0%
     */
    double salary = 100;
    String emp_class = "A";
    if (emp_class == "A") {
      salary = salary + salary * 0.5;
    } else if (emp_class == "B") {
      salary = salary + salary * 0.25;
    }
    System.out.println(salary);

    /*
    9. Дано целое положительное число n. Напишите программу для печати ряда Фибоначчи из n членов:

0 1 1 2 3 5 8 13 21 .....
     */
    int n = 10;
    int first = 0;
    int second = 1;
    for (int i = 0; i < n; i++) {
      System.out.print(first + " ");
      int next = first + second;
      first = second;
      second = next;
    }
  }
}