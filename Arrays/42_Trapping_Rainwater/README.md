# 42. Trapping Rain Water

**Difficulty:** Hard

## Problem Statement

Given an array `height` representing the elevation map where the width of each bar is `1`, compute how much rainwater can be trapped after raining.

---

## Approach: Prefix and Suffix Maximum Arrays

### Idea

- For each index, determine the tallest bar on its left and the tallest bar on its right.
- The water level at any index is the minimum of these two maximum heights.
- The trapped water at an index is the difference between the water level and the height of the current bar.
- Sum the trapped water for all indices to obtain the total trapped rainwater.

---

## Algorithm

1. Create a `leftMax` array where `leftMax[i]` stores the maximum height from index `0` to `i`.
2. Create a `rightMax` array where `rightMax[i]` stores the maximum height from index `i` to `n - 1`.
3. Traverse the array:
   - Compute the water level as `min(leftMax[i], rightMax[i])`.
   - Add `waterLevel - height[i]` to the total trapped water.
4. Return the total trapped rainwater.

---

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

---

## Concepts Used

- Arrays
- Prefix Maximum Array
- Suffix Maximum Array
- Simulation
- Dynamic Programming (Preprocessing)