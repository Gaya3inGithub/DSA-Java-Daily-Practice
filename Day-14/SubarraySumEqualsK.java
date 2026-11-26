import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static long countSubarrays(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Long, Integer> prefixFrequencies = new HashMap<>();
        prefixFrequencies.put(0L, 1);

        long prefixSum = 0;
        long subarrayCount = 0;

        for (int value : nums) {
            prefixSum += value;
            subarrayCount += prefixFrequencies.getOrDefault(prefixSum - k, 0);
            prefixFrequencies.merge(prefixSum, 1, Integer::sum);
        }

        return subarrayCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println("Subarrays with sum " + k + ": " + countSubarrays(nums, k));
    }
}
