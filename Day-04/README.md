# Day 04 - Rotate Array by K Positions

## Problem

Rotate an integer array to the right by `k` positions. Values shifted past the end wrap around to the beginning.

## Example

Input: `arr = [1, 2, 3, 4, 5, 6, 7]`, `k = 3`

Output: `[5, 6, 7, 1, 2, 3, 4]`

## Approach

Normalize `k` by the array length, then reverse the whole array, the first `k` elements, and the remaining elements. This performs the rotation in place. Negative values of `k` are also supported and rotate left.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Run

```bash
javac RotateArrayByKPositions.java
java RotateArrayByKPositions
```

## Java Files

- `RotateArrayByKPositions.java`
- `RotateArrayByKPositions.class`
