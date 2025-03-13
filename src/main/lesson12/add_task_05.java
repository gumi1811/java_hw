package main.lesson12;

// Sum of All Odd Length Subarrays https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class add_task_05 {
  public int sumOddLengthSubarrays(int[] arr) {
    int n = arr.length;
    int sum = 0;

    for (int i = 0; i < n; i++) {
      int totalSubarrays = (i + 1) * (n - i);
      int oddCount = (totalSubarrays + 1) / 2;  // Only odd-length subarrays
      sum += arr[i] * oddCount;
    }

    return sum;
  }

  public static void main(String[] args) {
    add_task_05 sol = new add_task_05();
    int[] arr1 = {1, 4, 2, 5, 3};
    int[] arr2 = {1, 2};
    int[] arr3 = {10, 11, 12};

    System.out.println(sol.sumOddLengthSubarrays(arr1)); // Output: 58
    System.out.println(sol.sumOddLengthSubarrays(arr2)); // Output: 3
    System.out.println(sol.sumOddLengthSubarrays(arr3)); // Output: 66
  }
}
