package edu.learn.java.leetcode.problems.easy;

/**
 * Given N balls of colour red, white or blue arranged in a line in random order. You have to
 * arrange all the balls such that the balls with the same colours are adjacent with the order of
 * the balls, with the order of the colours being red, white and blue (i.e., all red coloured balls
 * come first then the white coloured balls and then the blue coloured balls).
 *
 * <p>Consider the Colors as integers with Red = 0, White = 1, Blue = 2.
 */

/**
 * The Dutch National Flag Problem can be applied to all sorts of categorizations - e.g. - Move all
 * negative integers to one side, Sort the array with one type of variableon one side and the other
 * type on the other side.
 */
public class DutchNationalFlagProblem {

  public static int[] sortColors(int[] colors) {

    int low = 0, mid = 0, high = colors.length - 1, temp = 0;

    while (mid <= high) {
      if (colors[mid] == 0) {
        temp = colors[low];
        colors[low] = colors[mid];
        colors[mid] = temp;
        low++;
        mid++;
      } else if (colors[mid] == 1) {
        mid++;
      } else if (colors[mid] == 2) {
        temp = colors[mid];
        colors[mid] = colors[high];
        colors[high] = temp;
        high--;
      }
    }
    return colors;
  }

  static void printArray(int arr[], int arr_size) {
    int i;
    for (i = 0; i < arr_size; i++) System.out.print(arr[i] + " ");
    System.out.println("");
  }

  public static void main(String[] args) {

    int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    printArray(sortColors(arr), arr.length);
  }
}
