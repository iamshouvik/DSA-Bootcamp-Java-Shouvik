package com.shouvik.dsa_algomaster_io._02_bit_manipulation._01_xor_tricks;

import java.util.HashMap;
import java.util.Map;

public class Q4_SingleNumberII {
    public static int singleNumber_approach1(int[] nums) {
        /*Time Complexity: O(n). We iterate through the array once to build the count map, and then iterate through the map entries. Both passes are linear.
          Space Complexity: O(n). The hash map stores up to n/3 + 1 unique elements, which is O(n).*/
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num:nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1; // unreachable given problem constraints
    }

    public static int singleNumber_approach2(int[] nums) {
        /*Time Complexity: O(32n) = O(n). We iterate through all n elements 32 times (once per bit). Since 32 is a constant, this simplifies to O(n).
          Space Complexity: O(1). We only use a fixed number of variables (result, bitSum, loop counters), regardless of input size.*/
        int result = 0;

        // Process each of the 32 bit positions
        for(int i=0;i<32;i++){
            int bitSum = 0;

            // Count how many numbers have a 1 at bit position i
            for (int num:nums){
                bitSum += (num >> i) & 1;
            }

            // If the count % 3 is 1, the single number has a 1 here
            if(bitSum % 3 == 1){
                result |= (1<<i);
            }
        }

        return result;
    }

    public static int singleNumber_approach3(int[] nums) {
        /*Time Complexity: O(n). A single pass through the array, with O(1) bitwise operations per element.
        Space Complexity: O(1). Only two integer variables are used regardless of input size.*/
        int ones = 0, twos = 0;

        for (int num : nums) {
            // ones tracks bits seen once (mod 3)
            // twos tracks bits seen twice (mod 3)
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        // After all elements, ones holds bits that appeared once (mod 3)
        return ones;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 3, 2};
        System.out.println(singleNumber_approach3(nums1));

        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumber_approach3(nums2));

        int[] nums3 = { -2, -2, 1, -2 };
        System.out.println(singleNumber_approach3(nums3));
    }
}
