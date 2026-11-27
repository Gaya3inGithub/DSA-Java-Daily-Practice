# Day 15 - Merge Intervals

## Problem

Given an array of intervals where each interval is `[start, end]`, merge all overlapping intervals and return the resulting non-overlapping intervals.

## Example

Input: `[[1, 3], [2, 6], [8, 10], [15, 18]]`

Output: `[[1, 6], [8, 10], [15, 18]]`

## Approach

Copy and sort the intervals by start (then end) so the input remains unchanged. Scan in sorted order, extending the current interval when the next interval overlaps it; otherwise, add the current interval to the result and begin a new one. Intervals that only touch at an endpoint are considered overlapping.

Null or empty input returns an empty 2D array. Each interval must contain exactly two values with `start <= end`; invalid intervals cause an `IllegalArgumentException`.

## Complexity

- Time: O(n log n)
- Extra space: O(n)

## Run

```bash
javac MergeIntervals.java
java MergeIntervals
```

## Java Files

- `MergeIntervals.java`
- `MergeIntervals.class`
