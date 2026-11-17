# Day 05 - Maximum Subarray Sum (Kadane's Algorithm)

## Problem

Given a non-empty integer array, find the largest sum of any contiguous subarray.

## Example

Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`

Output: `6`

The maximum-sum contiguous subarray is `[4, -1, 2, 1]`.

## Approach

Kadane's algorithm tracks the best sum ending at the current position. At each element, either start a new subarray there or extend the previous one. Keep the largest sum seen so far. Initializing from the first value also handles arrays containing only negative numbers.

The method returns a `long` so the sum of multiple `int` values does not overflow an `int`. It rejects null and empty arrays because they have no non-empty subarray.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Run

```bash
javac MaximumSubarraySum.java
java MaximumSubarraySum
```

## Java Files

- `MaximumSubarraySum.java`
- `MaximumSubarraySum.class`
