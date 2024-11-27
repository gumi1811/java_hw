package main;

public class lesson6 {
  public static void main(String[] args) {
    /*
    Выполните следующие инструкции:
1. Дан массив чисел. Напишите программу для вычисления среднего
значения элементов одномерного массива.
Дано:
[1, 3, 4, 1, 5, 5]
Вывод:
Среднее значение = 3.16666667
     */

    int[] myIntegers = {1, 3, 4, 1, 5, 5};
    int sum = 0;

    for (int myInteger : myIntegers) {
      sum += myInteger;
    }
    double average = (double) sum / (double) myIntegers.length;
    System.out.println("average: " + average);


  /*
  2. Дан массив целых значений.
  Напишите программу для поиска дубликатов значений.
Дано:
[1, 3, 4, 1, 5, 5]
Вывод:
Дубликаты = 1, 5
   */

    int[] myIntegers2 = {1, 3, 4, 1, 5, 5};
    for (int i = 0; i < myIntegers2.length; i++) {
      for (int j = 0; j < i; j++) {
        if (myIntegers2[i] == myIntegers2[j]) {
          System.out.println(myIntegers2[i]);
          break;
        }
      }
    }

    /*
    3. Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.
     a)
     */
    int[] myIntegers3 = {1, 3, -6, 23, 14, 2};
    int x = 23;
    boolean exist = false;
    for (int i = 0; i < myIntegers3.length; i++) {
      if (myIntegers3[i] == x) {
        exist = true;
        break;
      }
    }
    if (exist == true) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    /*
     b) Дано:
     [1, 3, -6, 23, 14, 2]
     int x = 0
     Вывод:
     False
     */
    int[] myIntegers4 = {1, 3, -6, 23, 14, 2};
    int x1 = 0;
    boolean exist1 = false;
    for (int i = 0; i < myIntegers4.length; i++) {
      if (myIntegers4[i] == x1) {
        exist1 = true;
        break;
      }
    }
    if (exist1 == false) {
      System.out.println("false");
    } else {
      System.out.println("true");
    }

/*
4. Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.
1)дано:
[1, 3, -6, 23, 14, 2]
int x = 23
Вывод:
Индекс = 3
 */
    int[] array = {1, 3, -6, 23, 14, 2};
    int x2 = 23;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == x2) {
        System.out.println(i);
        break;
      }
    }
    /*
    4.2)Дано:
      [1, 3, -6, 23, 14, 2]
      int x = 5
      Вывод:
      Не найдено
     */
    int[] array1 = {1, 3, -6, 23, 14, 2};
    int x3 = 5;

    for (int i = 0; i < array1.length; i++) {
      if (array1[i] == x3) {
        System.out.println(i);
        break;
      }
    }
    // ответ : не найден

    /*
    5. Даны массив целых значений и целые числа n, m. Напишите программу для нахождения подмассива между индексами n и m.
      1) Дано:
        [34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7]
         int n = 3
         int m = 8
         Вывод:
         [30, 25, 40, 32, 31, 35]
     */

    int[] array3 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
    int n = 3;
    int m = 8;
    for (int i = n; i <= m; i++) {
      System.out.print(array3[i] + ", ");
    }
    System.out.println();


    /*
    5. 2)Дано:
     [1, 3, -6, 23, 14, 2]
     int n = 1
     int m = 3
     Вывод:
     [3, -6, 23]
     */

    int[] array4 = {1, 3, -6, 23, 14, 2};
    int n1 = 1;
    int m1 = 3;
    for (int i = n1; i <= m1; i++) {
      System.out.print(array4[i] + ",");
    }
    System.out.println();

    /*
    6. Дан массив целых значений.
    Напишите программу для нахождения наибольшего и наименьшего элементов массива.
    Дано:[1, 3, -6, 23, 14, 2]
    Вывод: Минимальный элемент = -6
           Максимальный элемент = 23
     */
    int[] array5 = {1, 3, -6, 23, 14, 2};
    int min = array5[0];
    for (int i = 1; i < array5.length; i++) {
      if (array5[i] < min) {
        min = array5[i];
      }
    }
    int max = array5[0];
    for (int i = 1; i < array5.length; i++) {
      if (array5[i] > max) {
        max = array5[i];
      }
    }
    System.out.println("Минимальный элемент: " + min);
    System.out.println("Максимальный элемент: " + max);

    /*
7. Дан массив целых значений.
Напишите программу для нахождения наименьшего и второго наименьшего элементов заданного массива.
Дано: [1, 3, -6, 23, 14, 2]
Вывод: Наименьший элемент = -6
       Второй наименьший элемент = 1
 */
    int[] array6 = {1, 3, -6, 23, 14, 2};
    int Min = array6[0];
    for (int i = 0; i < array6.length; i++) {
      if (array6[i] < Min) {
        Min = array6[i];
      }
    }
    int secondMin = array6[0];
    for (int i = 0; i < array6.length; i++) {
      if (array6[i] < secondMin && array6[i] != Min) {
        secondMin = array6[i];
      }
    }
    System.out.println("Наименьший элемент: " + Min);
    System.out.println("Второй наименьший элемент: " + secondMin);

    /*
    8. Дан массив целых значений.
    Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.
    Дано: [1, 2, 3, 0, 4, 6]
   Вывод: 643210
     */
    int[] array7 = {1, 2, 3, 0, 4, 6};
    for (int i = 0; i < array7.length; i++) {
      for (int j = array7.length - 1; j > i; j--) {
        if (array7[j] > array7[j - 1]) {
          int n7 = array7[j];
          array7[j] = array7[j - 1];
          array7[j - 1] = n7;
        }
      }
    }
    for (int i = 0; i < array7.length; i++) {
      System.out.print(array7[i]);
    }
    System.out.println();

    /*
    9.1 Дан двумерный массив целых значений.
     Напишите программу для печати массива после изменения строк и столбцов заданного двумерного массива.
     */
    int[][] array8 = {{10, 20, 30}, {40, 50, 60}};
    for (int j = 0; j < array8[0].length; j++) {
      for (int i = 0; i < array8.length; i++) {
        System.out.print(array8[i][j] + " ");
      }
      System.out.println();
    }

    // 9.2
    int[][] array9 = {{4, 2, 1}, {2, 7, 2}};
    for (int j = 0; j < array9[0].length; j++) {
      for (int i = 0; i < array9.length; i++) {
        System.out.print(array9[i][j] + " ");
      }
      System.out.println();
    }

    /*
    10. Напишите программу, которая возвращает сумму всех значений в двумерном массиве.
     */
    int[][] array10 = {{10, 20, 30}, {40, 50, 60}};
    int sum1 = 0;
    for (int i = 0; i < array10.length; i++) {
      for (int j = 0; j < array10[i].length; j++) {
        sum1 = sum1 + array10[i][j];
      }
      System.out.println(sum1);
    }

    // 11.1
    int[][] array11 = {{10, 20, 30}, {40, 50, 60}};
    System.out.println(array11.length == array11[0].length);

    // 11.2
    int[][] array12 = {{10, 20}, {40, 50}};
    System.out.println(array12.length == array12[0].length);

    // 12
    int n7 = 5;
    int[][] array13 = new int[n7][n7];
    for (int i = 0; i < n7; i++) {
      for (int j = 0; j < n7; j++) {
        array13[i][j] = (i + 1) * (j + 1);
      }
    }
    for (int i = 0; i < array13.length; i++) {
      for (int j = 0; j < array13[i].length; j++) {
        System.out.print(array13[i][j] + " ");
      }
      System.out.println();
    }

    // 13. Напишите программу, которая возвращает максимальное и минимальное значение, найденные в двумерном массиве.
    int[][] array14 = {{10, 20, 30}, {40, 50, 60}};
    int max3 = array14[0][0];
    int min3 = array14[0][0];
    for (int i = 0; i < array14.length; i++) {
      for (int j = 0; j < array14[i].length; j++) {
        if (array14[i][j] > max3) {
          max3 = array14[i][j];
        }
        if (array14[i][j] < min3) {
          min3 = array14[i][j];
        }
      }
    }
    System.out.println("Максимальный элемент: " + max3);
    System.out.println("Минимальный элемент: " + min3);

  }
}


