package com.shouvik.dsa_algomaster_io._02_bit_manipulation._01_xor_tricks;

import java.util.HashMap;
import java.util.Map;

public class Q1_SingleNumber {
    public static int singleNumber_approach1(int[] nums) {
        /*Time Complexity: O(n^2). For each of the n elements, we scan up to n elements looking for a duplicate. In the worst case, the single number is at the end, so we do roughly n * n comparisons.
          Space Complexity: O(1). We only use a boolean flag and loop variables. No extra data structures.*/

        for (int i = 0; i < nums.length; i++) {
            boolean foundDuplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    foundDuplicate = true;
                    break;
                }
            }
            if (!foundDuplicate) {
                return nums[i];
            }
        }
        return -1; // unreachable given problem constraints
    }

    public static int singleNumber_approach2(int[] nums) {
        /*Time Complexity: O(n). One pass to build the map, one pass to find the single element. Both are O(n).
          Space Complexity: O(n). The hash map stores up to (n+1)/2 unique elements, which is O(n).*/

        Map<Integer, Integer> countMap = new HashMap<>();
        // Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        // Find the number that appears exactly once
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1; // unreachable given problem constraints
    }

    public static int singleNumber_approach3(int[] nums) {
        /*Time Complexity: O(n). We iterate through the array exactly once, performing a constant-time XOR at each step.
          Space Complexity: O(1). We only use a single integer variable result. No extra data structures needed.*/

        int result = 0;
            for (int num : nums) {
                result ^= num; // pairs cancel out, single number remains
            }
            return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber_approach3(nums1));

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber_approach3(nums2));

        int[] nums3 = { 1 };
        System.out.println(singleNumber_approach3(nums3));
    }
}
