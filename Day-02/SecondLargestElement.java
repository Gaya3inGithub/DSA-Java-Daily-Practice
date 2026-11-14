public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = 0;
        int secondLargest = 0;
        boolean hasLargest = false;
        boolean hasSecondLargest = false;

        for (int value : arr) {
            if (!hasLargest || value > largest) {
                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }
                largest = value;
                hasLargest = true;
            } else if (value < largest && (!hasSecondLargest || value > secondLargest)) {
                secondLargest = value;
                hasSecondLargest = true;
            }
        }

        return hasSecondLargest ? secondLargest : -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 10, 10};
        int[] arr3 = {-5, -2, -10, -1};

        System.out.println("Test 1: " + findSecondLargest(arr1)); // Expected: 34
        System.out.println("Test 2: " + findSecondLargest(arr2)); // Expected: -1
        System.out.println("Test 3: " + findSecondLargest(arr3)); // Expected: -2
    }
}
