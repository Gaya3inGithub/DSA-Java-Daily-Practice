# Day 09 - Longest Substring Without Repeating Characters

## Problem

Given a string, find the length of the longest substring that contains no repeated characters.

## Example

Input: `"abcabcbb"`

Output: `3`

Explanation: `"abc"` is the longest substring without repeating characters.

## Approach

Use a sliding window and a hash set to track characters in the current substring. Expand the window with the right pointer. When a character already exists in the window, move the left pointer forward until that character is removed.

The method returns `0` for `null` or empty strings.

## Complexity

- Time: O(n)
- Extra space: O(min(n, character set size))

## Run

```bash
javac LongestSubstringWithoutRepeating.java
java LongestSubstringWithoutRepeating
```

## Java Files

- `LongestSubstringWithoutRepeating.java`
- `LongestSubstringWithoutRepeating.class`
