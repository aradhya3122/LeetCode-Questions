# 217. Contains Duplicate

**Difficulty:** Easy

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

## Solution 1: Sorting

### Approach
- Sort the array.
- Traverse the sorted array and compare each element with its previous element.
- If two adjacent elements are equal, a duplicate exists.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)` *(excluding the sorting algorithm's internal space)*

---

## Solution 2: HashSet

### Approach
- Create a `HashSet` to store visited elements.
- Traverse the array.
- If the current element already exists in the `HashSet`, return `true`.
- Otherwise, add it to the `HashSet`.
- If no duplicates are found after the traversal, return `false`.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## Files

- `Solution1.java` – Sorting Approach
- `Solution2.java` – HashSet Approach

---

## Concepts Used

- Arrays
- Sorting
- HashSet
- Linear Traversal