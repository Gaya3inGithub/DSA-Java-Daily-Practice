# Day 16 - Search in Rotated Sorted Array

## Problem

Given an integer array `nums` that was sorted in ascending order and then rotated at an unknown pivot, find the index of `target`. Return `-1` if the target is not present.

Assume all values in `nums` are distinct.

## Example

Input: `nums = [4, 5, 6, 7, 0, 1, 2]`, `target = 0`

Output: `4`

## Approach

Use binary search. At each step, one half of the current search range is sorted. Check whether the target lies within that half; if it does, continue there, otherwise search the other half. This keeps the search logarithmic without first finding the rotation pivot.

The method returns `-1` for null or empty arrays and when the target is absent.

## Complexity

- Time: O(log n)
- Extra space: O(1)

## Run

```bash
javac SearchInRotatedSortedArray.java
java SearchInRotatedSortedArray
```

## Java Files

- `SearchInRotatedSortedArray.java`
- `SearchInRotatedSortedArray.class`
