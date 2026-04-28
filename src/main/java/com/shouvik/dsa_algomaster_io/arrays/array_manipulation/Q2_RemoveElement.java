package com.shouvik.dsa_algomaster_io.arrays.array_manipulation;

import java.util.Arrays;

public class Q2_RemoveElement {
    public static int removeElement_approach1(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static int removeElement_approach2(int[] nums, int val) {
        /*Time Complexity: O(n). A single pass through the array. Each element is visited exactly once.
        Space Complexity: O(1). Only uses a couple of integer variables. No extra data structures.*/
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static int removeElement_approach3(int[] nums, int val) {
        /*Time Complexity: O(n). Each iteration either advances i or decrements n, so at most n iterations total.
          Space Complexity: O(1). Only uses two integer variables.*/
        int i = 0;
        int l = nums.length;

        while(i<l){
            if(nums[i] == val){
                nums[i] = nums[l-1];
                l--;
            } else {
                i++;
            }
        }
        for(i=0;i<l;i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        return l;
    }

    public static void main(String[] args) {
        int nums1[] = {3, 2, 2, 3};
        int val1 = 3;
        System.out.println(removeElement_approach3(nums1, val1));

        int nums2[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        System.out.println(removeElement_approach3(nums2, val2));
    }
}
