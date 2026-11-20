# Day 08 - Product of Array Except Self

## Problem

Given an integer array `nums`, return an array where each element is the product of all input elements except the one at that index. Do not use division.

## Example

Input: `nums = [1, 2, 3, 4]`

Output: `[24, 12, 8, 6]`

## Approach

In the first pass, store the product of all values to the left of each index. In the second pass, multiply each stored value by the product of all values to its right. This handles zeros without any special case or division.

The method returns `long[]` and uses checked multiplication; it throws `ArithmeticException` if an intermediate product exceeds the `long` range.

## Complexity

- Time: O(n)
- Extra space: O(1), excluding the output array

## Run

```bash
javac ProductOfArrayExceptSelf.java
java ProductOfArrayExceptSelf
```

## Java Files

- `ProductOfArrayExceptSelf.java`
- `ProductOfArrayExceptSelf.class`
