import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static long[] productExceptSelf(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        long[] products = new long[nums.length];
        long prefixProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            products[i] = prefixProduct;
            prefixProduct = Math.multiplyExact(prefixProduct, nums[i]);
        }

        long suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] = Math.multiplyExact(products[i], suffixProduct);
            suffixProduct = Math.multiplyExact(suffixProduct, nums[i]);
        }

        return products;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

        int[] withZero = {1, 2, 0, 4};
        System.out.println(Arrays.toString(productExceptSelf(withZero)));
    }
}
