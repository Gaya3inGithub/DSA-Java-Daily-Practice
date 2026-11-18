# Day 06 - Two Sum

## Problem

Given an integer array `nums` and a target value, return the indices of two different elements whose sum is the target.

Assume that exactly one valid pair exists. If no pair is found, the method returns `[-1, -1]`.

## Example

Input: `nums = [2, 7, 11, 15]`, `target = 9`

Output: `[0, 1]`

Explanation: `nums[0] + nums[1] = 2 + 7 = 9`.

## Approach

Use a hash map to store each value and its index as the array is scanned. For the current value, calculate `target - nums[i]`. If the complement already exists in the map, return both indices. Otherwise, store the current value and continue.

## Complexity

- Time: O(n)
- Extra space: O(n)

## Run

```bash
javac TwoSum.java
java TwoSum
```

## Java Files

- `TwoSum.java`
- `TwoSum.class`
