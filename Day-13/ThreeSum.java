import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return triplets;
        }

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length - 2; i++) {
            if (i > 0 && sorted[i] == sorted[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = sorted.length - 1;
            while (left < right) {
                long sum = (long) sorted[i] + sorted[left] + sorted[right];
                if (sum == 0) {
                    triplets.add(Arrays.asList(sorted[i], sorted[left], sorted[right]));
                    left++;
                    right--;

                    while (left < right && sorted[left] == sorted[left - 1]) {
                        left++;
                    }
                    while (left < right && sorted[right] == sorted[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(findTriplets(nums));
    }
}
