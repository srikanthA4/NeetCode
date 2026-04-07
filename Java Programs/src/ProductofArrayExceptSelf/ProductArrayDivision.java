package ProductofArrayExceptSelf;

public class ProductArrayDivision {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int totalProduct = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        for (int i = 0; i < n; i++) {

            if (zeroCount > 1) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                result[i] = totalProduct / nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ProductArrayDivision obj = new ProductArrayDivision();

        int[] nums = {-1,0,1,2,3};
        int[] res = obj.productExceptSelf(nums);

        for (int num : res) System.out.print(num + " ");
    }
}
