package com.shouvik.dsa_algomaster_io.arrays.finding_and_counting;

public class Q7_MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes_approach1(int[] nums) {
        /*Time Complexity: O(n). We visit each element exactly once. The work per element is O(1): one comparison, one increment or reset, and one max update.
          Space Complexity: O(1). Only two integer variables (count and maxCount). No extra data structures regardless of input size.*/
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static int findMaxConsecutiveOnes_approach2(int[] nums) {
    /*Time Complexity: O(n^2). For each starting index, we potentially scan the rest of the array. In the worst case (all 1's), the inner loop runs n, n-1, n-2, ... times, which sums to O(n^2).
      Space Complexity: O(1). Only a few integer variables are used. No extra data structures.*/
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int count = 0;
                // Count consecutive 1's starting at i
                int j = i;
                while (j < nums.length && nums[j] == 1) {
                    count++;
                    j++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes_approach1(nums1));

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes_approach1(nums2));
    }
}
