# Day 07 - Best Time to Buy and Sell Stock

## Problem

Given an array where `prices[i]` is a stock's price on day `i`, choose one day to buy and a later day to sell. Return the maximum possible profit. If no profitable trade is possible, return `0`.

## Example

Input: `prices = [7, 1, 5, 3, 6, 4]`

Output: `5`

Buy on day 2 at price `1` and sell on day 5 at price `6`.

## Approach

Scan the prices once, keeping the lowest price seen so far and the best profit achievable by selling on the current day. The method returns `0` for null or fewer than two prices. The result uses `long` to safely represent the difference between any two `int` prices.

## Complexity

- Time: O(n)
- Extra space: O(1)

## Run

```bash
javac BestTimeToBuyAndSellStock.java
java BestTimeToBuyAndSellStock
```

## Java Files

- `BestTimeToBuyAndSellStock.java`
- `BestTimeToBuyAndSellStock.class`
