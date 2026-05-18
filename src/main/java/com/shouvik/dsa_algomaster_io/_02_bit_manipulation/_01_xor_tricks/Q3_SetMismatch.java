package com.shouvik.dsa_algomaster_io._02_bit_manipulation._01_xor_tricks;

import java.util.*;

public class Q3_SetMismatch {
    public static int[] findErrorNums_approach1(int[] nums) {
        /*
        Time Complexity: O(n log n). Sorting dominates at O(n log n). The subsequent linear scan is O(n), which gets absorbed.
        Space Complexity: O(1) or O(log n). No extra data structures, ignoring the internal stack space used by sorting algorithms.
         */
        Arrays.sort(nums);
        int n = nums.length;
        int duplicate = -1, missing = -1;

        // Check if 1 is missing
        if (nums[0] != 1) {
            missing = 1;
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }

        // If missing is still not found, it must be n
        if (missing == -1) {
            missing = n;
        }

        return new int[]{duplicate, missing};
    }

    public static int[] findErrorNums_approach2(int[] nums) {
        /*
        Time Complexity: O(n). One pass to build the frequency map, one pass over [1, n] to find the duplicate and missing. Both are O(n).
        Space Complexity: O(n). The hash map stores up to n entries.
         */
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        int duplicate = -1, missing = -1;

        // Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the duplicate (count 2) and missing (count 0)
        for (int i = 1; i <= n; i++) {
            int count = countMap.getOrDefault(i, 0);
            if (count == 2) {
                duplicate = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static int[] findErrorNums_approach3(int[] nums) {
        /*
        Time Complexity: O(n). Two passes through the array: one for marking, one for finding the missing number. Each is O(n).
        Space Complexity: O(1). Only a constant number of extra variables. The marking is done in place by modifying the input array.
        */
        int n = nums.length;
        int duplicate = -1, missing = -1;

        // Mark visited indices by negating values
        for (int i = 0; i < n; i++) {
            int targetIdx = Math.abs(nums[i]) - 1;
            if (nums[targetIdx] < 0) {
                // Already visited, this is the duplicate
                duplicate = Math.abs(nums[i]);
            } else {
                nums[targetIdx] = -nums[targetIdx];
            }
        }

        // The index with a positive value is the missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums_approach3(nums1)));

        int[] nums2 = {1, 1};
        System.out.println(Arrays.toString(findErrorNums_approach3(nums2)));

        int[] nums3 = {3, 2, 3, 4, 6, 5};
        System.out.println(Arrays.toString(findErrorNums_approach3(nums3)));
    }
}
