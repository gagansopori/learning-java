package edu.learn.java.leetcode.problems.easy;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However,
 * flowers cannot be planted in adjacent plots.
 *
 * <p>Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not
 * empty, and an integer n, return true if n new flowers can be planted in the flowerbed without
 * violating the no-adjacent-flowers rule and false otherwise.
 *
 * <p>Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: true
 *
 * <p>Example 2: Input: flowerbed = [1,0,0,0,1], n = 2 Output: false
 *
 * <p>Constraints: 1 <= flowerbed.length <= 2 * 104 flowerbed[i] is 0 or 1. There are no two
 * adjacent flowers in flowerbed. 0 <= n <= flowerbed.length
 */
public class CanPlaceFlowers {

  public static boolean canPlaceFlowers(int[] flowerbed, int n) {

    int len = flowerbed.length;

    if (n == 0) return true;

    for (int i = 0; i < len; i += 2) {
      if (flowerbed[i] == 0) {
        if (i == len - 1 || flowerbed[i] == flowerbed[i + 1]) {
          n--;
        } else {
          i++;
        }
      }
    }
    return n <= 0;
  }

  public static void main(String[] args) {
    System.out.println();
  }
}
