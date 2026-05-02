package com.shouvik.dsa_algomaster_io._01_arrays._01_array_manipulation;

public class Q5_RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates_approach1(int[] nums) {
        /*Time Complexity: O(n). We iterate through the array once. Each element is visited and processed in O(1) time.
          Space Complexity: O(1). Only a couple of integer variables (writePos, count). No extra data structures.*/

        if(nums.length <= 2){
            return nums.length;
        }

        int writePos = 1;
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            } else {
                count = 1;
            }

            if(count<=2){
                nums[writePos] = nums[i];
                writePos++;
            }
        }

        return writePos;
    }

    public static int removeDuplicates_approach2(int[] nums) {
        /*Time Complexity: O(n). Single pass through the array. Each element is compared and possibly written in O(1) time.
          Space Complexity: O(1). Only one extra variable (writePos). The result is built in-place within the original array.*/

        if(nums.length <= 2){
            return nums.length;
        }

        int writePos = 2;

        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[writePos-2]){
                nums[writePos] = nums[i];
                writePos++;
            }
        }

        return writePos;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates_approach2(nums1));

        int nums2[] = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates_approach2(nums2));

        int nums3[] = {1};
        System.out.println(removeDuplicates_approach2(nums3));
    }
}
