package TopKFrequentElements;
import java.util.*;
public class TopKFrequentSorting {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert to list and sort
        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        // Pick top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentSorting obj = new TopKFrequentSorting();

        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(obj.topKFrequent(nums, k))); // [3,2]
    }
}
