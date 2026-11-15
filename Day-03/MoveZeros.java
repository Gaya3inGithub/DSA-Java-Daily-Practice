import java.util.Arrays;

public class MoveZeros {

    public static void moveZerosToEnd(int[] arr) {
        int nextNonZero = 0;

        for (int value : arr) {
            if (value != 0) {
                arr[nextNonZero++] = value;
            }
        }

        while (nextNonZero < arr.length) {
            arr[nextNonZero++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
