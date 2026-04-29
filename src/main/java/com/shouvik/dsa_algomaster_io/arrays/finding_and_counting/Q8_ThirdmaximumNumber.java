package com.shouvik.dsa_algomaster_io.arrays.finding_and_counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8_ThirdmaximumNumber {
    public static int thirdMax_approach1(int[] nums) {
        /*Time Complexity: O(n log n). Sorting dominates. The subsequent linear scan is O(n), but sorting takes O(n log n).
          Space Complexity: O(1) to O(n). Depends on the sorting implementation. In-place sorts use O(log n) stack space, while some languages allocate O(n).*/

        Arrays.sort(nums);
        int count = 1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] != nums[i+1]){
                count++;
            }
            if(count == 3){
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }

    public static int thirdMax_approach2(int[] nums) {
        /*Time Complexity: O(n). A single pass through the array. Each element requires at most 3 comparisons (duplicate check) plus at most 3 more (position check), so O(1) work per element.
          Space Complexity: O(1). Only three extra variables regardless of input size.*/

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int num:nums){
            if(num == firstMax || num == secondMax || num == thirdMax){
                continue;
            }
            if(num > firstMax){
                // New largest: shift everything down
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if(num >secondMax){
                // New second largest: shift third down
                thirdMax = secondMax;
                secondMax = num;
            } else if(num > thirdMax){
                // New third largest
                thirdMax = num;
            }
        }

        // If third was never assigned, return the maximum
        return (int)(thirdMax == Long.MIN_VALUE ? firstMax : thirdMax);
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        System.out.println(thirdMax_approach1(nums1));

        int[] nums2 = {1, 2};
        System.out.println(thirdMax_approach1(nums2));

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(thirdMax_approach1(nums3));
    }
}
