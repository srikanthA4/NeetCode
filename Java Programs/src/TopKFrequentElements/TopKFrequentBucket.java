package TopKFrequentElements;
import java.util.*;
public class TopKFrequentBucket {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket array
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = bucket.length - 1; i >= 0 && resultList.size() < k; i--) {

            if (bucket[i] != null) {
                resultList.addAll(bucket[i]);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentBucket obj = new TopKFrequentBucket();

        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(obj.topKFrequent(nums, k))); // [3,2]
    }
}
