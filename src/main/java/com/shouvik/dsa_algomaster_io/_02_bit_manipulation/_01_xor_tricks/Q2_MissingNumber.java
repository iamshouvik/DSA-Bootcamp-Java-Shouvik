package com.shouvik.dsa_algomaster_io._02_bit_manipulation._01_xor_tricks;

import java.util.*;

public class Q2_MissingNumber {
    public static int missingNumber_approach1(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber_approach2(int[] nums) {
        /*Time Complexity: O(n). Building the hash set takes O(n). Checking membership for each of the n+1 numbers takes O(1) per lookup on average. Total: O(n).
          Space Complexity: O(n). The hash set stores all n elements from the array.*/

        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            numSet.add(num);
        }

        // Check which number in [0, n] is missing
        for (int i = 0; i <= n; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        return -1; // Should never reach here
    }

    public static int missingNumber_approach3(int[] nums) {
        /*Gauss' Formula (Sum)
        * Time Complexity: O(n). One pass through the array to compute the sum.
          Space Complexity: O(1). Only uses a couple of integer variables.*/

        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static int missingNumber_approach4(int[] nums) {
        /*Time Complexity: O(n). Single pass through the array, doing constant work per element.
          Space Complexity: O(1). Only uses a single integer variable.*/

        int n = nums.length;
        int xor = 0;

        // XOR all indices [1, n] and all array elements
        for (int i = 0; i < n; i++) {
            xor ^= (i + 1) ^ nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println(missingNumber_approach4(nums1));

        int[] nums2 = {0, 1};
        System.out.println(missingNumber_approach4(nums2));

        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber_approach4(nums3));
    }
}
