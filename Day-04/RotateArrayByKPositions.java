import java.util.Arrays;

public class RotateArrayByKPositions {

    public static void rotateRight(int[] arr, int k) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int rotations = Math.floorMod(k, arr.length);
        if (rotations == 0) {
            return;
        }

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, arr.length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int value = arr[left];
            arr[left++] = arr[right];
            arr[right--] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateRight(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
