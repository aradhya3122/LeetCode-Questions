# 75. Sort Colors

**Difficulty:** Medium

## Problem Statement

Given an array `nums` containing only `0`s, `1`s, and `2`s, sort the array in-place so that objects of the same color are adjacent.

The colors are represented as:

- `0` → Red
- `1` → White
- `2` → Blue

You must solve the problem without using the library's sort function.

---

## Approach: Counting Sort

### Idea

Since the array contains only three distinct values (`0`, `1`, and `2`), count the frequency of each value first.

After counting:

- Place all `0`s at the beginning of the array.
- Then place all `1`s.
- Finally, place all `2`s.

This sorts the array in linear time without using any built-in sorting method.

---

## Algorithm

1. Create a count array of size `3`.
2. Traverse the input array and count the occurrences of `0`, `1`, and `2`.
3. Traverse the count array.
4. For each value:
   - Insert it into the original array as many times as its frequency.
5. The array is now sorted in-place.

---

## Time Complexity

**O(n)**

- One traversal to count the frequencies.
- One traversal to rewrite the original array.

## Space Complexity

**O(1)**

Only a fixed-size count array of length `3` is used.

---

## Concepts Used

- Arrays
- Counting Sort
- Frequency Counting
- In-Place Array Modification
- Linear Traversal