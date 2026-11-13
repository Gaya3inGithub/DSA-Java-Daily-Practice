# Day 01 - Largest Element in an Array

## Problem

Given an array of integers, find the largest element in the array.

## Example

Input array:

```java
int[] arr = {10, 5, 20, 8, 15};
```

Output:

```text
Largest Element: 20
```

## Approach

- Start by assuming the first element is the largest.
- Traverse the array from index 1 onward.
- If a value is greater than the current largest, update the largest value.
- Print the final largest number.

## Java File

- LargestElement.java

## Notes

This solution uses a single pass through the array and has a time complexity of O(n).
