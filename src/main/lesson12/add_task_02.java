package main.lesson12;

// Palindrome number https://leetcode.com/problems/palindrome-number/
public class add_task_02 {
  public boolean isPalindrome(int x) {
    // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int reversed = 0;
    int original = x;

    while (x > reversed) {
      reversed = reversed * 10 + x % 10;
      x /= 10;
    }

    // Compare either the half-reversed number or ignoring the middle digit (for odd-length numbers)
    return x == reversed || x == reversed / 10;
  }

  public static void main(String[] args) {
    add_task_02 obj = new add_task_02();
    System.out.println(obj.isPalindrome(121));
    System.out.println(obj.isPalindrome(-121));
    System.out.println(obj.isPalindrome(10));

  }
}
