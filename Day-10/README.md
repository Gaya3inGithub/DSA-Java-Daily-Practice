# Day 10 - Anagram

## Problem

Given two strings, determine whether they are anagrams: each string must contain the same characters with the same frequencies, in any order.

Comparison is case-sensitive, and spaces and punctuation are treated as characters. Unicode code points are counted as individual characters.

## Example

Input: `"listen"`, `"silent"`

Output: `true`

## Approach

Count the Unicode code points in the first string with a hash map, then decrement those counts while scanning the second string. If a character is missing or has already been used too many times, the strings are not anagrams. Null inputs return `false`.

## Complexity

- Time: O(n + m), where `n` and `m` are the strings' code point counts
- Extra space: O(u), where `u` is the number of distinct code points

## Run

```bash
javac Anagram.java
java Anagram
```

## Java Files

- `Anagram.java`
- `Anagram.class`
