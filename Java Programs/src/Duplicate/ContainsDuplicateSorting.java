package Duplicate;


import java.util.Arrays;

public class ContainsDuplicateSorting {
    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateSorting obj = new ContainsDuplicateSorting();

        int[] nums = {1, 2, 3, 3};

        System.out.println(obj.hasDuplicate(nums)); // true
    }
}
