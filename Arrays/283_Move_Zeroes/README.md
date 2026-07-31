# 283. Move Zeroes

**Difficulty:** Easy

## Problem Statement

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The operation must be performed **in-place** without making a copy of the array.

---

## Approach: Two Pointers

### Idea

Use two pointers:

- `high` → Traverses the entire array.
- `low` → Keeps track of the position where the next non-zero element should be placed.

Whenever `high` finds a non-zero element:

1. Swap `nums[high]` with `nums[low]`.
2. Move `low` forward.

Zeros are automatically moved toward the end of the array through these swaps.

---

## Algorithm

1. Initialize `low = 0`.
2. Traverse the array using `high` from `0` to `nums.length - 1`.
3. If `nums[high]` is non-zero:
   - Swap `nums[high]` and `nums[low]`.
   - Increment `low`.
4. Continue until the entire array is processed.
5. The non-zero elements remain in their original relative order, while all zeros are moved to the end.

---

## Example

### Input

```text
[0, 1, 0, 3, 12]
```

### Output

```text
[1, 3, 12, 0, 0]
```

---

## Time Complexity

**O(n)**

The array is traversed only once.

## Space Complexity

**O(1)**

The array is modified in-place using only two pointers and a temporary variable for swapping.

---

## Concepts Used

- Arrays
- Two Pointers
- In-Place Modification
- Swapping
- Single Pass Traversal