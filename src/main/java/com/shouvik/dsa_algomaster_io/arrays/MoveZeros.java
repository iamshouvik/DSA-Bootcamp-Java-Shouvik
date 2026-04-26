package com.shouvik.dsa_algomaster_io.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes_approach1(int[] nums) {

        /*Time Complexity: O(n). We iterate through the array twice: once to collect non-zeroes and once to copy back. Both passes are O(n), so the total is O(n).
        Space Complexity: O(n). We allocate an extra array of the same size as the input.*/

        int l = nums.length;
        int arr[] = new int[l];
        int k=0;

        // Collect non-zero elements
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                arr[k] = nums[i];
                k++;
            }
        }

        // Copy result back into nums
        for (int i = 0; i < l; i++) {
            nums[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes_approach2(int[] nums) {

        /*Time Complexity: O(n). A single pass through the array. Each element is visited exactly once.
          Space Complexity: O(1). Only a couple of extra variables (insertPos, temp). No additional data structures.*/

        int l = nums.length;
        int insertPos=0;

        // Collect non-zero elements
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes_approach3(int[] nums) {

        /*Time Complexity: O(n). Single pass through the array, same as Approach 2.
          Space Complexity: O(1). Only uses a couple of integer variables.*/

        int l = nums.length;
        int insertPos = 0;

        // Collect non-zero elements
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                if (i != insertPos) {
                    nums[insertPos] = nums[i];
                    nums[i] = 0;
                }
                insertPos++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        moveZeroes_approach3(nums);
    }
}
