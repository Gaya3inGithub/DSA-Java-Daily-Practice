public class ContainerWithMostWater {

    public static long maxWaterArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        long maximumArea = 0;

        while (left < right) {
            int shorterLine = Math.min(height[left], height[right]);
            long area = (long) shorterLine * (right - left);
            maximumArea = Math.max(maximumArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maximumArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water area: " + maxWaterArea(height));
    }
}
