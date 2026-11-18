import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> seenValues = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer complementIndex = seenValues.get(complement);

            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            }

            seenValues.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }
}
