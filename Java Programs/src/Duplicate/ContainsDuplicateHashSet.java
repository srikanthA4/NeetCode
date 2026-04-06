package Duplicate;


import java.util.HashSet;

public class ContainsDuplicateHashSet {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateHashSet obj = new ContainsDuplicateHashSet();

        int[] nums = {1, 2, 3, 4};

        System.out.println(obj.hasDuplicate(nums)); // false
    }
}
