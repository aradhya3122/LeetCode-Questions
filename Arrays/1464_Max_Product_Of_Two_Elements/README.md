# 1464. Maximum Product of Two Elements in an Array

**Difficulty:** Easy

## Problem Statement

Given the integer array `nums`, choose two different indices `i` and `j` such that:

```text
0 <= i, j < nums.length
```

Return the maximum value of:

```text
(nums[i] - 1) * (nums[j] - 1)
```

---

## Approach: Find Two Maximum Elements

### Idea

The maximum product will always be obtained by choosing the two largest elements in the array.

Instead of sorting the entire array, find the two largest elements using a single traversal.

Maintain two variables:

- `max1` → Largest element
- `max2` → Second largest element

Whenever a larger element is found, update both maximum values accordingly.

---

## Algorithm

1. Initialize `max1` and `max2` to `Integer.MIN_VALUE`.
2. Traverse the array.
3. If the current element is greater than `max1`:
   - Move `max1` to `max2`.
   - Update `max1` with the current element.
4. Otherwise, if the current element is greater than `max2`, update `max2`.
5. After finding the two maximum elements, calculate:
   ```text
   (max1 - 1) * (max2 - 1)
   ```
6. Return the result.

---

## Time Complexity

**O(n)**

Only one traversal of the array is required.

## Space Complexity

**O(1)**

Only two variables are used to store the maximum elements.

---

## Concepts Used

- Arrays
- Single Pass Traversal
- Finding Maximum Elements
- Greedy Approach
- Constant Space