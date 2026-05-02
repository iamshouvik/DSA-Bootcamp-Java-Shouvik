package com.shouvik.dsa_algomaster_io._01_arrays._02_finding_and_counting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q10_MajorityElement {

    public static int majorityElement_approach1(int[] nums) {
        int threshold = nums.length / 2;

        for (int i : nums) {
            int count = 0;
            for (int j : nums) {
                if (i == j) {
                    count++;
                }
            }
            if (threshold <= count) {
                return i;
            }
        }
        return 0;
    }

    public static int majorityElement_approach2(int[] nums) {
        /*Time Complexity: O(n). We iterate through the array once. Each hash map operation (get and put) is O(1) on average.
        Space Complexity: O(n). In the worst case, we store up to n/2 distinct elements in the map before finding the majority element.*/

        Map<Integer, Integer> counts = new HashMap<>();
        int threshold = nums.length/2;

        for(int num:nums){
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            // Return as soon as we find the majority element
            if(count > threshold){
                return num;
            }
        }
        return 0;
    }

    public static int majorityElement_approach3(int[] nums) {
        /*Time Complexity: O(n log n). Dominated by the sorting step. The index lookup is O(1).
          Space Complexity: O(1) to O(n). Depends on the sorting algorithm. In-place sorts like heapsort use O(1) extra space. Languages that use mergesort (like Python's Timsort) may use O(n) extra space.*/

        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElement_approach4(int[] nums) {
        /* Boyer-Moore Voting Algorithm
          Time Complexity: O(n). A single pass through the array with O(1) work per element.
          Space Complexity: O(1). Just two variables: candidate and count. No extra data structures at all.*/

        int candidate = 0;
        int count = 0;

        for(int num:nums){
            if(count == 0){
                candidate = num;
                count = 1;
            } else if(num == candidate){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement_approach4(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement_approach4(nums2));
    }
}
