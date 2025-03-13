package main.lesson12;

// Number of Steps to Reduce a Number to Zero https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class add_task_03 {
  public int numberOfSteps(int num) {
    int steps = 0;
    while (num > 0) {
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num -= 1;
      }
      steps++;
    }
    return steps;
  }

  public static void main(String[] args) {
    add_task_03 solution = new add_task_03();
    System.out.println(solution.numberOfSteps(14));  // Output: 6
    System.out.println(solution.numberOfSteps(8));   // Output: 4
    System.out.println(solution.numberOfSteps(123)); // Output: 12
  }
}
