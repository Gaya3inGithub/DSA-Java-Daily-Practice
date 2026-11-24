# Day 12 - Trapping Rain Water

## Problem

Given `n` non-negative integers representing an elevation map, where each bar has width `1`, compute how much water the map can trap after raining.

## Example

Input: `height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]`

Output: `6`

## Approach

Use two pointers, `left` and `right`, starting at opposite ends of the array. Track the highest bars seen so far with `leftMax` and `rightMax`. Process the side with the lower current bar: its maximum boundary determines how much water that position can hold. Move that pointer inward and accumulate trapped water.

The method returns `0` for a null array or fewer than three bars. The total is returned as `long` to safely hold the accumulated volume.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Run

```bash
javac TrappingRainWater.java
java TrappingRainWater
```

## Java Files

- `TrappingRainWater.java`
- `TrappingRainWater.class`
