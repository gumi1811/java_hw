package main.undefined;

public class lesson7_1 {
  static int min(int a, int b, int c) {
    int res = a;

    if (b < res) {
      res = b;
    }

    if (c < res) {
      res = c;
    }

    return res;
  }

  public static void main(String[] args) {
    /*
     1. Напишите метод для нахождения наименьшего числа среди трех чисел.
     Дано: первое число: 25
          Второе число: 37
          Третье число: 29
          Ожидаемый результат:
          Наименьшее значение: 25
     */
    System.out.println(min(25,15,5));

  }
}
