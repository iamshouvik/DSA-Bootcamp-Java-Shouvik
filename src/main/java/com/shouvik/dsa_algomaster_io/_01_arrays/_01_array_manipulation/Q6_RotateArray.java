package com.shouvik.dsa_algomaster_io._01_arrays._01_array_manipulation;

import java.util.Arrays;

public class Q6_RotateArray {
    public static void rotate_approach1(int[] nums, int k) {
        /*Time Complexity: O(n * k). Each rotation shifts all n elements one position. We do this k times, so it's O(n * k). In the worst case, k can be close to n, making this O(n^2).
          Space Complexity: O(1). We only use one extra variable (last) regardless of input size.*/

        int lastPos = nums.length-1;
        k = k % lastPos;

        while(k>0){
            int t = nums[lastPos];
            for(int i=lastPos;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = t;
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate_approach2(int[] nums, int k) {
        /*Time Complexity: O(n). We iterate through the array twice: once to fill the temporary array, once to copy back. Both are O(n).
          Space Complexity: O(n). We use a temporary array of the same size as the input.*/

        int n = nums.length;
        k %= n;
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            res[(i + k) % n] = nums[i];
        }

        System.arraycopy(res, 0, nums, 0, n);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }

    public static void rotate_approach3(int[] nums, int k) {
        /*Time Complexity: O(n). Each reversal visits at most n elements. We do 3 reversals, so it's 3 * O(n) = O(n).
          Space Complexity: O(1). We only use a single temporary variable for swapping. No extra arrays, no recursion stack.*/

        int n = nums.length;
        k %= n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate_approach3(nums1, k1);

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate_approach3(nums2, k2);
    }
}
