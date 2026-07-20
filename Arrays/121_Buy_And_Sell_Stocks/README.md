# 121. Best Time to Buy and Sell Stock

**Difficulty:** Easy

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a stock on the `iᵗʰ` day.

Choose a single day to buy one stock and a different future day to sell it. Return the maximum profit you can achieve. If no profit is possible, return `0`.

---

## Approach: One Pass Traversal

### Idea

- Keep track of the minimum stock price encountered so far.
- For each day, calculate the profit that would be obtained by selling on that day.
- Update the maximum profit whenever a larger profit is found.
- Continue until the end of the array.

---

## Algorithm

1. Initialize `buyPrice` as the maximum possible integer value.
2. Initialize `maxProfit` as `0`.
3. Traverse the array:
   - Update `buyPrice` if a lower price is found.
   - Calculate the current profit as `currentPrice - buyPrice`.
   - Update `maxProfit` if the current profit is greater.
4. Return `maxProfit`.

---

## Time Complexity

**O(n)**

## Space Complexity

**O(1)**

---

## Concepts Used

- Arrays
- Greedy Algorithm
- One Pass Traversal
- Math (`Math.min()`, `Math.max()`)