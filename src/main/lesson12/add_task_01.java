package main.lesson12;

// Shuffle String https://leetcode.com/problems/shuffle-string/
public class add_task_01 {
  public String restoreString(String s, int[] indices) {
    char[] shuffled = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      shuffled[indices[i]] = s.charAt(i);
    }

    return new String(shuffled);
  }

  public static void main(String[] args) {
    add_task_01 solution = new add_task_01();
    System.out.println(solution.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3})); // Output: "leetcode"
    System.out.println(solution.restoreString("abc", new int[]{0,1,2})); // Output: "abc"
  }
}
