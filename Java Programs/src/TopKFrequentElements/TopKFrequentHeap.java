package TopKFrequentElements;
import java.util.*;
public class TopKFrequentHeap {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Min Heap based on frequency
        PriorityQueue<Integer> heap =
                new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {
            heap.add(num);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentHeap obj = new TopKFrequentHeap();

        int[] nums = {7,7};
        int k = 1;

        System.out.println(Arrays.toString(obj.topKFrequent(nums, k))); // [7]
    }
}
