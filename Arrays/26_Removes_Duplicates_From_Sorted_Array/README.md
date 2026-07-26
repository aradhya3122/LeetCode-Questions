# 26. Remove Duplicates from Sorted Array

**Difficulty:** Easy

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements in `nums`.

The relative order of the elements should be maintained.

---

## Approach: Two Pointers

### Idea

- Since the array is sorted, duplicate elements appear next to each other.
- Use one pointer `i` to traverse the array.
- Use another pointer `length` to keep track of the position where the next unique element should be placed.
- Whenever a new unique element is found, place it at the `length` index and increment `length`.
- The value of `length` represents the number of unique elements.

---

## Algorithm

1. Initialize `length = 1` because the first element is always unique.
2. Traverse the array starting from index `1`.
3. Compare the current element with the previous element.
4. If they are different:
   - Store the current element at `nums[length]`.
   - Increment `length`.
5. Return `length`.

---

## Time Complexity

**O(n)**

## Space Complexity

**O(1)**

---

## Concepts Used

- Arrays
- Two Pointers
- In-Place Modification
- Sorted Array