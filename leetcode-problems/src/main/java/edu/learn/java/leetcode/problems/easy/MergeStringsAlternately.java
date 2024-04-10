package edu.learn.java.leetcode.problems.easy;

/**
 * 1768. Merge Strings Alternately
 *
 * <p>You are given two strings word1 and word2. Merge the strings by adding letters in alternating
 * order, starting with word1. If a string is longer than the other, append the additional letters
 * onto the end of the merged string.
 *
 * <p>Return the merged string.
 *
 * <p>Example 1: <br>
 * <b>Input:</b> word1 = "abc", word2 = "pqr" <br>
 * <b>Output:</b> "apbqcr" <br>
 * <b>Explanation:</b> The merged string will be merged as so: word1: a b c word2: p q r merged: a p
 * b q c r
 *
 * <p>Example 2: <br>
 * <b>Input:</b> word1 = "ab", word2 = "pqrs" <br>
 * <b>Output:</b> "apbqrs" <br>
 * <b>Explanation:</b> Notice that as word2 is longer, "rs" is appended to the end. word1: a b
 * word2: p q r s merged: a p b q r s
 *
 * <p>Example 3: <br>
 * <b>Input:</b> word1 = "abcd", word2 = "pq" <br>
 * <b>Output:</b> "apbqcd" <br>
 * <b>Explanation:</b> Notice that as word1 is longer, "cd" is appended to the end. word1: a b c d
 * word2: p q merged: a p b q c d
 *
 * <p><b>Constraints:</b> <br>
 * 1 <= word1.length, word2.length <= 100 <br>
 * word1 and word2 consist of lowercase English letters.
 */
public class MergeStringsAlternately {

  public static String mergeAlternately(String word1, String word2) {
    int ptr1 = 0, ptr2 = 0, idx = 0;
    int loopCtr = Math.max(word1.length(), word2.length());

    StringBuilder sb = new StringBuilder();

    while (idx < loopCtr) {
      if (ptr1 < word1.length()) {
        sb.append(word1.charAt(ptr1));
        ptr1++;
      }
      if (ptr2 < word2.length()) {
        sb.append(word2.charAt(ptr2));
        ptr2++;
      }
      idx++;
    }
    return sb.toString();
  }

  public static void main(String[] args) {

    System.out.println(mergeAlternately("abc", "pqr"));
    System.out.println(mergeAlternately("ab", "pqrs"));
    System.out.println(mergeAlternately("abcd", "pq"));
  }
}
