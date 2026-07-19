# 33. Search in Rotated Sorted Array

**Difficulty:** Medium

## Problem Statement

Given a rotated sorted array `nums` with unique elements and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

---

## Approach: Modified Binary Search

### Idea
- Use Binary Search to achieve `O(log n)` time complexity.
- At each iteration, determine which half of the array is sorted.
- If the target lies within the sorted half, continue searching there.
- Otherwise, search in the other half.
- Repeat until the target is found or the search space becomes empty.

---

## Algorithm

1. Initialize `low = 0` and `high = n - 1`.
2. Calculate the middle index.
3. If `nums[mid]` equals the target, return `mid`.
4. Check whether the left half is sorted.
5. If the target lies in the sorted half, discard the other half.
6. Otherwise, search in the remaining half.
7. Repeat until `low > high`.
8. Return `-1` if the target is not found.

---

## Time Complexity

**O(log n)**

## Space Complexity

**O(1)**

---

## Concepts Used

- Binary Search
- Modified Binary Search
- Rotated Sorted Array
- Arrays