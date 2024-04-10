package edu.learn.java.leetcode.problems.easy;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t
 * is concatenated with itself one or more times). Given two strings str1 and str2, return the
 * largest string x such that x divides both str1 and str2.
 *
 * <p>Example 1: Input: str1 = "ABCABC", str2 = "ABC Output: "ABC"
 *
 * <p>Example 2: Input: str1 = "ABABAB", str2 = "ABAB" Output: "AB"
 *
 * <p>Example 3: Input: str1 = "LEET", str2 = "CODE" Output: ""
 *
 * <p>Constraints: 1 <= str1.length, str2.length <= 1000 str1 and str2 consist of English uppercase
 * letters.
 */
public class GreatestCommonDivisorOfStrings {

  /**
   * <b>Euclid's Algorithm By Subtraction</b>: GCD of two numbers doesn�t change if the smaller
   * number is subtracted from the bigger number. <br>
   * <b>Euclid's Divisibility Algorithm</b>: Same as subtraction, but we divide instead of
   * subtraction. Below is an iterative approach of the same.
   *
   * @param str1
   * @param str2
   * @return
   */
  public static String gcdOfStrings(String str1, String str2) {

    if (!str1.concat(str2).equalsIgnoreCase(str2.concat(str1))) return "";

    int lenStr1 = str1.length(), lenStr2 = str2.length(), subStrLen = 0;

    String finalStr = "";

    // iterative approach using euclids subtraction
    while (lenStr1 != lenStr2) {
      if (lenStr1 > lenStr2) lenStr1 -= lenStr2;

      if (lenStr1 < lenStr2) lenStr2 -= lenStr1;
    }

    // recursive approach using division
    if (str1.length() > str2.length()) {
      subStrLen = gcd(str1.length(), str2.length());
    } else if (str1.length() < str2.length()) {
      subStrLen = gcd(str2.length(), str1.length());
    }

    finalStr = str1.substring(0, subStrLen);

    return str1.substring(0, lenStr1);
  }

  public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {

    System.out.println(gcdOfStrings("ABCABC", "ABC"));
    System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    System.out.println(gcdOfStrings("LEET", "CODE"));
  }
}
