package edu.learn.java.leetcode.problems.hard;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * <p>Example 1:
 *
 * <p>Input: height = [0,1,0,2,1,0,1,3,2,1,2,1] Output: 6 Explanation: The above elevation map
 * (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain
 * water (blue section) are being trapped.
 *
 * <p>Example 2: Input: height = [4,2,0,3,2,5] Output: 9
 *
 * <p>Constraints: n == height.length 1 <= n <= 2 * 104 0 <= height[i] <= 105
 */
public class TrappingRainwater {

  /**
   * <b>Intuition:</b> Rainwater can only be trapped if there is an area between left building and
   * right building. i.e. in a valley of sorts. So in order to be able to find how much rainwater
   * can be trapped, we can count the number of valleys that are formed. Given that each elemnt
   * represents height of the building/land, a valley will be formed if there is a pocket of small
   * land between two large buildings.
   *
   * <p>In other words, For any pocket that to store water - it has to have a left building & a
   * right building that stop the water from overflowing. Since we need to be aware of two points at
   * any given time. We can approach this problem with a two pointer solution. We can assign to
   * pointers to denote max left height & max right height & calculate the value between left and
   * right. f(x) = Min(leftMax, rightMax) - arr[x]
   *
   * @param height
   * @return
   */
  public static int trap(int[] height) {

    int left = 0, right = height.length - 1;

    int leftMax = 0, rightMax = 0;
    int trappedWater = 0;

    while (left < right) {
      if (height[left] <= height[right]) {
        if (height[left] >= leftMax) {
          leftMax = height[left];
        } else {
          trappedWater += leftMax - height[left];
        }
        left++;
      } else {
        if (height[right] >= rightMax) {
          rightMax = height[right];
        } else {
          trappedWater += rightMax - height[right];
        }
        right--;
      }
    }
    return trappedWater;
  }

  public static void main(String[] args) {

    System.out.println(trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    System.out.println(trap(new int[] {4, 2, 0, 3, 2, 5}));
  }
}
