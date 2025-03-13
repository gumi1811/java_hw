package main.lesson12;

// Напишите программу, чтобы поменять местами две переменные
public class task_03 {
  public static void main(String[] args) {
    int a = 5, b = 10;

    System.out.println("До обмена: a = " + a + ", b = " + b);

    // Обмен значений без использования третьей переменной
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("После обмена: a = " + a + ", b = " + b);
  }
}
