package com.shouvik.dsa_algomaster_io.arrays.array_manipulation;

import java.util.Arrays;

public class Q3_ShuffleTheArray {
    public static int[] shuffle_approach1(int[] nums, int n) {
        int l = nums.length;
        int[] temp1 = new int[l/2];
        int[] temp2 = new int[l/2];
        int k = 0;

        for(int i=0;i<n;i++){
            temp1[i] = nums[i];
        }

        for(int i=0;i<n;i++){
            temp2[i] = nums[i+n];
        }

        for(int i=0;i<n;i++){
            nums[k++] = temp1[i];
            nums[k++] = temp2[i];
        }

        return nums;
    }

    public static int[] shuffle_approach2(int[] nums, int n) {
        /*Time Complexity: O(n). We iterate through half the array once, doing O(1) work per iteration (two assignments). The total work is proportional to n.
        Space Complexity: O(n). We allocate a new array of size 2n to hold the result.*/

        int[] res = new int[2*n];

        for(int i=0;i<n;i++){
            res[2 * i] = nums[i];
            res[(2*i)+1] = nums[n+i];
        }

        return res;
    }

    public static int[] shuffle_approach3(int[] nums, int n) {
        /*Time Complexity: O(n). Two passes through the array: one for encoding, one for decoding. Each pass does O(1) work per element.
          Space Complexity: O(1). We modify the input array in place. No extra array is allocated.*/

        int maxVal = 1001;

        for(int i=n-1;i>=0;i--){
            nums[2 * i + 1] += (nums[n+i] % maxVal) * maxVal;
            nums[2 * i] += (nums[i] % maxVal) * maxVal;
        }

        for(int i=0;i<2*n;i++){
            nums[i] = nums[i]/maxVal;
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums1[] = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        System.out.println(Arrays.toString(shuffle_approach3(nums1, n1)));

        int nums2[] = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        System.out.println(Arrays.toString(shuffle_approach3(nums2, n2)));

        int nums3[] = {1, 1, 2, 2};
        int n3 = 2;
        System.out.println(Arrays.toString(shuffle_approach3(nums3, n3)));
    }
}
