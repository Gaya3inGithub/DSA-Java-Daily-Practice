# Day 14 - Subarray Sum Equals K

## Problem

Given an integer array `nums` and an integer `k`, return the number of contiguous subarrays whose elements sum to `k`.

## Example

Input: `nums = [1, 1, 1]`, `k = 2`

Output: `2`

The matching subarrays are the first two elements and the last two elements.

## Approach

Scan the array while tracking the running prefix sum. For each position, the number of earlier prefix sums equal to `prefixSum - k` is the number of subarrays ending at that position with sum `k`. Store prefix-sum frequencies in a hash map. This works with negative and zero values and avoids checking every subarray.

The method returns `0` for a null or empty array. Prefix sums and the result use `long` to reduce overflow risk.

## Complexity

- Time: O(n) average
- Extra space: O(n)

## Run

```bash
javac SubarraySumEqualsK.java
java SubarraySumEqualsK
```

## Java Files

- `SubarraySumEqualsK.java`
- `SubarraySumEqualsK.class`
