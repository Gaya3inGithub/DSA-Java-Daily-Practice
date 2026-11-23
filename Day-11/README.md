# Day 11 - Container With Most Water

## Problem

Given an integer array `height` of length `n`, each value represents the height of a vertical line at its index. Choose two lines that, together with the x-axis, form a container. Return the maximum amount of water the container can store. The container cannot be slanted.

## Example

Input: `height = [1, 8, 6, 2, 5, 4, 8, 3, 7]`

Output: `49`

The lines at indices `1` and `8` form an area of `min(8, 7) * (8 - 1) = 49`.

## Approach

Start with pointers at both ends of the array. Calculate the area using the shorter line as the limiting height, then move the pointer at that shorter line inward. The width decreases at each step, so moving the taller line cannot produce a larger area than the current pair; the shorter line is the one that may improve the result.

The method returns `0` for a null array or one with fewer than two lines. Its return type is `long` to safely hold areas computed from `int` heights.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Run

```bash
javac ContainerWithMostWater.java
java ContainerWithMostWater
```

## Java Files

- `ContainerWithMostWater.java`
- `ContainerWithMostWater.class`
