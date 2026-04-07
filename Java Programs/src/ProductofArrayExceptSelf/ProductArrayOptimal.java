package ProductofArrayExceptSelf;

public class ProductArrayOptimal {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Prefix
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Suffix
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductArrayOptimal obj = new ProductArrayOptimal();

        int[] nums = {1,2,4,6};
        int[] res = obj.productExceptSelf(nums);

        for (int num : res) System.out.print(num + " ");
    }
}
