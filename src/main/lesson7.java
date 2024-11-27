package main;

public class lesson7 {
  static int min(int a, int b, int c) {
    int res;
    res = a;
    if (b < res) {
      res = b;
    }
    if (c < res) {
      res = c;
    }
    return res;
  }

  static double average(int a, int b, int c) {
    return (a + b + c) / 3.0;
  }

  static int vowels_count(String s) {
    int res = 0;
    char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < vowels.length; j++) {
        if (s.charAt(i) == vowels[j]) {
          res = res + 1;
          break;
        }
      }
    }
    return res;
  }

  static int word_count(String s) {
    String[] word_arr = s.split(" ");
    return word_arr.length;
  }

  static int digit_count(int a) {
    int res = 0;
    String s = String.valueOf(a);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '2') {
        res = res + 1;
      }
    }
    return res;
  }

  static boolean is_all_vowel_symbols(String s) {
    char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};

    boolean found;
    for (int i = 0; i < s.length(); i++) {
      found = false;
      for (int j = 0; j < vowels.length; j++) {
        if (s.charAt(i) == vowels[j]) {
          found = true;
          break;
        }
      }
      if (found == false) {
        return false;
      }
    }
    return true;
  }

  static double pentagon_area(int side_count, int side_length) {
    return (side_count * Math.pow(side_length, 2)) / (4 * Math.tan(Math.PI / side_count));
  }

  static int digit_amount(int a) {
    int res = 0;
    while (a > 0) {
      res = res + a % 10;
      a = a / 10;
    }
    return res;
  }

  public static void main(String[] args) {
    // 1. Напишите метод для нахождения наименьшего числа среди трех чисел.
    System.out.println("Наименьшее значение: " + min(25, 37, 29));

    // 2. Напишите метод для вычисления среднего значения трех чисел.
    System.out.println("Среднее значение: " + average(25, 45, 65));

    // 3. Напишите метод подсчета всех гласных букв в строке.
    System.out.println("Количество всех гласных букв: " + vowels_count("DarTech123"));

    // 4. Напишите метод для подсчета всех слов в строке.
    System.out.println("Количество всех слов в строке: " + word_count("Java is good to learn Object Oriented programming."));

    // 5. Дано целое неотрицательное число. Напишите метод для подсчета количества цифр числа, имеющих значение 2.
    System.out.println("Количество цифр числа, имеющих значение 2: " + digit_count(1254212));

    // 6. Напишите метод, который проверяет, все ли символы в заданной строке являются гласными (a, e, i, o, u) или нет.
    // Верните true, если каждый символ строки является гласным, иначе верните false.
    System.out.println("Все ли символы в заданной строке являются гласными: " + is_all_vowel_symbols("AIEEE"));

    // 7. Напишите метод для определения площади пятиугольника.
    System.out.println("Площадь пятиугольника: " + pentagon_area(5, 6));

    // 8. Напишите метод для вычисления суммы цифр целого числа.
    System.out.println("Сумма цифр целого числа: " + digit_amount(252));
  }
}
