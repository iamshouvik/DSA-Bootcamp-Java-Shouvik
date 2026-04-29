package com.shouvik.dsa_algomaster_io.arrays.finding_and_counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q9_MissingRanges {

    public static List<List<Integer>> findMissingRanges_approach1(int[] nums, int lower, int upper) {
        /*Time Complexity: O(n). We iterate through the array once, checking each consecutive pair. Each gap check is O(1), so the total is O(n).
          Space Complexity: O(1). Ignoring the output list, we only use a few variables.*/

        List<List<Integer>> resultList = new ArrayList<>();
        int n = nums.length;

        if(n == 0){
            resultList.add(Arrays.asList(lower, upper));
            return resultList;
        }

        // Gap before the first element
        if(lower < nums[0]){
            resultList.add(Arrays.asList(lower, nums[0]-1));
        }

        // Gaps between consecutive elements
        for(int i=0;i<n-1;i++){
            if(nums[i + 1] - nums[i] > 1) {
                resultList.add(Arrays.asList(nums[i] + 1, nums[i+1] - 1));
            }
        }

        // Gap after the last element
        if(nums[n - 1] < upper){
            resultList.add(Arrays.asList(nums[n - 1] + 1, upper));
        }

        return resultList;
    }

    public static List<List<Integer>> findMissingRanges_approach2(int[] nums, int lower, int upper) {
        /*Time Complexity: O(n). Single pass through the array, O(1) work per element. Same asymptotic complexity as Approach 1.
          Space Complexity: O(1). Only a few integer variables beyond the output list.*/

        List<List<Integer>> resultList = new ArrayList<>();
        int prev = lower - 1;

        for(int i=0;i<=nums.length;i++){
            // Use upper + 1 as the virtual element after the array
            int curr = (i < nums.length) ? nums[i] : upper + 1;

            if (curr - prev > 1) {
                resultList.add(Arrays.asList(prev + 1, curr - 1));
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 3, 50, 75};
        int lower1 = 0;
        int upper1 = 99;
        System.out.println(findMissingRanges_approach1(nums1, lower1, upper1));

        int[] nums2 = {-1};
        int lower2 = -1;
        int upper2 = -1;
        System.out.println(findMissingRanges_approach1(nums2, lower2, upper2));

        int[] nums3 = {1, 3, 5, 7};
        int lower3 = 0;
        int upper3 = 9;
        System.out.println(findMissingRanges_approach1(nums3, lower3, upper3));
    }
}
