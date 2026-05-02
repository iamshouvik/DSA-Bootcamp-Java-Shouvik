package com.shouvik.dsa_algomaster_io._01_arrays._01_array_manipulation;

import java.util.*;

public class Q4_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates_approach1(int[] nums) {
        /*Time Complexity: O(n log n). Inserting n elements into a hash set is O(n). Converting to a list and sorting is O(k log k) where k is the number of unique elements (at most n). Overall: O(n log n).
          Space Complexity: O(n). The hash set and sorted list together use O(n) extra space in the worst case (when all elements are unique).*/

        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }

        List<Integer> unique = new ArrayList<>(seen);
        Collections.sort(unique);

        for(int i=0;i<unique.size();i++){
            nums[i] = unique.get(i);
        }

        return unique.size();
    }

    public static int removeDuplicates_approach2(int[] nums) {
        /*Time Complexity: O(n). A single pass through the array. Each element is visited exactly once, and each comparison and assignment is O(1).
          Space Complexity: O(1). Only one extra variable (insertPos). No additional data structures.*/

        if(nums.length == 0){
            return 0;
        }

        int insertPos = 1;

        for(int i=1;i< nums.length;i++){
            if(nums[i] != nums[insertPos - 1]){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return insertPos;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 1, 2};
        System.out.println(removeDuplicates_approach2(nums1));

        int nums2[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates_approach2(nums2));

        int nums3[] = {1};
        System.out.println(removeDuplicates_approach2(nums3));
    }
}
