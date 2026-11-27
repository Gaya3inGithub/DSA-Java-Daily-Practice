import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        int[][] sorted = new int[intervals.length][];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] == null || intervals[i].length != 2
                    || intervals[i][0] > intervals[i][1]) {
                throw new IllegalArgumentException("Each interval must contain a valid [start, end] pair");
            }
            sorted[i] = intervals[i].clone();
        }

        Arrays.sort(sorted, (first, second) -> {
            int startComparison = Integer.compare(first[0], second[0]);
            return startComparison != 0
                    ? startComparison
                    : Integer.compare(first[1], second[1]);
        });

        List<int[]> merged = new ArrayList<>();
        int[] current = sorted[0];

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i][0] <= current[1]) {
                current[1] = Math.max(current[1], sorted[i][1]);
            } else {
                merged.add(current);
                current = sorted[i];
            }
        }
        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
