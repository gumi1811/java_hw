package main.lesson12;

// Напишите программу для нахождения второго по величине числа из массива
public class task_08 {
  public static int findSecondLargest(int[] arr) {
    if (arr == null || arr.length < 2) {
      throw new IllegalArgumentException("Массив должен содержать как минимум два элемента");
    }

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > first) {
        second = first;
        first = num;
      } else if (num > second && num != first) {
        second = num;
      }
    }

    if (second == Integer.MIN_VALUE) {
      throw new IllegalArgumentException("Нет второго уникального элемента в массиве");
    }

    return second;
  }

  public static void main(String[] args) {
    int[] numbers = {10, 20, 4, 45, 99, 99, 33};
    System.out.println("Второе по величине число: " + findSecondLargest(numbers));
  }
}
