# Day 02 - Second Largest Element

## Problem

Find the second-largest distinct value in an integer array. If the array contains fewer than two distinct values, the solution returns `-1`.

## Examples

| Input | Output |
| --- | ---: |
| `{12, 35, 1, 10, 34, 1}` | `34` |
| `{10, 10, 10}` | `-1` |
| `{-5, -2, -10, -1}` | `-2` |

## Approach

Traverse the array once while tracking the largest and second-largest distinct values. Equal values do not replace the second-largest value.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Java File

- `SecondLargestElement.java`
