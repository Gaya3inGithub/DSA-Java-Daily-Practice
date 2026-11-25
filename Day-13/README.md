# Day 13 - 3Sum (Triplets With Zero Sum)

## Problem

Given an integer array `nums`, find all unique triplets `[nums[i], nums[j], nums[k]]` such that the three values sum to zero. Each triplet must use three different indices, and duplicate triplets must not appear in the result.

## Example

Input: `[-1, 0, 1, 2, -1, -4]`

Output: `[[-1, -1, 2], [-1, 0, 1]]`

## Approach

Sort a copy of the input so the original array remains unchanged. Fix each distinct first value and search the remaining range with two pointers. Move the left or right pointer based on the sum, and skip repeated values after finding a triplet to ensure unique results. The sum is calculated as `long` to avoid integer overflow.

For a null array or fewer than three values, the method returns an empty list.

## Complexity

- Time: O(n^2)
- Extra space: O(n) for the sorted copy, excluding the result

## Run

```bash
javac ThreeSum.java
java ThreeSum
```

## Java Files

- `ThreeSum.java`
- `ThreeSum.class`
