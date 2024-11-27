package main;

public class lesson7_1_gumi {
  static int minNum(int x, int y, int j) {
    int numbers = x;
    if (y < numbers) {
      numbers = y;
    }
    if (j < numbers) {
      numbers = j;
    }
    return numbers;
  }

  //7.2

  static double MidNum( int a, int b, int c) {
  double Sum = (a + b + c) / 3.0;
   return Sum;
  }

  //7.3
  static int vowels(String x1) {
    String y1 = x1.toLowerCase();


    String[] str_arr = {"a", "e", "i", "o", "u", "y"};
    //for (int i = 0; i < vowels.length(); i++) {
    return 0;
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
      System.out.println(minNum(25, 37, 29));




      /*
      2. Напишите метод для вычисления среднего значения трех чисел.
        дано:   Первое число: 25
                Второе число: 45
                Третье число: 65
        Ожидаемый результат:  Среднее значение 45,0
       */
    System.out.println("Cреднее значение :" +  MidNum(25, 45, 65));


     /*
      3. Напишите метод подсчета всех гласных букв в строке.
    Дано: DarTech123
    Ожидаемый результат: Количество гласных в строке: 2
      */







  }
}
