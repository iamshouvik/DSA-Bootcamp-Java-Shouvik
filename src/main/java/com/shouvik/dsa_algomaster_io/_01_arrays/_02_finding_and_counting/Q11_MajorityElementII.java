package com.shouvik.dsa_algomaster_io._01_arrays._02_finding_and_counting;

import java.util.*;

public class Q11_MajorityElementII {

    public static List<Integer> majorityElement_approach1(int[] nums) {
        /*Time Complexity: O(n). We iterate through the array once to build the count map, and once more through the map entries. Both passes are O(n).
          Space Complexity: O(n). In the worst case (all unique elements), the hash map stores n entries.*/

        int n = nums.length;
        int threshold = n / 3;
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements that appear more than n/3 times
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static List<Integer> majorityElement_approach2(int[] nums) {
        /*Time Complexity: O(n log n). Sorting takes O(n log n). The subsequent linear scan is O(n), so sorting dominates.
        Space Complexity: O(1). We use only a few variables. Some sorting algorithms use O(log n) stack space, but no auxiliary data structures.*/

        int n = nums.length;
        int threshold = n / 3;
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;
        while (i < n) {
            int current = nums[i];
            int count = 0;
            // Count consecutive occurrences of current element
            while (i < n && nums[i] == current) {
                count++;
                i++;
            }
            if (count > threshold) {
                result.add(current);
            }
        }

        return result;
    }

    public static List<Integer> majorityElement_approach3(int[] nums) {
        /*Time Complexity: O(n). Two passes through the array, each O(n). Total is O(2n) = O(n).
          Space Complexity: O(1). Only uses a fixed number of variables: two candidates, two counters, and the result list.*/

        int n = nums.length;
        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;

        // First pass: find candidates
        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                // Cancel: three distinct elements found
                count1--;
                count2--;
            }
        }

        // Second pass: verify candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(cand1);
        if (count2 > n / 3) result.add(cand2);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement_approach3(nums1));

        int[] nums2 = {1, 1, 1, 3, 2, 2, 2, 3};
        System.out.println(majorityElement_approach3(nums2));
    }
}
