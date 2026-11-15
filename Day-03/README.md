# Day 03 - Move Zeros to the End

## Problem

Move every zero in an integer array to the end while keeping the relative order of nonzero elements unchanged.

## Example

Input: `[0, 1, 0, 3, 12]`

Output: `[1, 3, 12, 0, 0]`

## Approach

Copy each nonzero value forward in the same array, then fill the remaining positions with zeros.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Java Files

- `MoveZeros.java`
- `MoveZeros.class`
