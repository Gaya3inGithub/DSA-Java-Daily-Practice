public class MaximumSubarraySum {

    public static long maxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        long currentSum = arr[0];
        long maximumSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maximumSum = Math.max(maximumSum, currentSum);
        }

        return maximumSum;
    }

    public static void main(String[] args) {
        int[] values = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubarraySum(values));

        int[] allNegative = {-8, -3, -6, -2, -5, -4};
        System.out.println("All-negative array maximum: " + maxSubarraySum(allNegative));
    }
}
