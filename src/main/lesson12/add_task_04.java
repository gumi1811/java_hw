package main.lesson12;

// Check If Two String Arrays are Equivalent https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class add_task_04 {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    // Concatenate the elements of each array
    String str1 = String.join("", word1);
    String str2 = String.join("", word2);

    // Compare the concatenated strings
    return str1.equals(str2);
  }

  public static void main(String[] args) {
    add_task_04 solution = new add_task_04();

    String[] word1a = {"ab", "c"};
    String[] word2a = {"a", "bc"};
    System.out.println(solution.arrayStringsAreEqual(word1a, word2a)); // true

    String[] word1b = {"a", "cb"};
    String[] word2b = {"ab", "c"};
    System.out.println(solution.arrayStringsAreEqual(word1b, word2b)); // false

    String[] word1c = {"abc", "d", "defg"};
    String[] word2c = {"abcddefg"};
    System.out.println(solution.arrayStringsAreEqual(word1c, word2c)); // true
  }
}
