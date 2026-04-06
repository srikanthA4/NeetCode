package Sums;

//HashMap (Optimized Approach)
// Input:
// nums = [3,4,5,6], target = 7

// Output: [0,1]  That means 3+4=7

//Here what we are doing is sum of 2 integers is need to equal the target integer

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(result[0] + ", " + result[1]);
    }
}