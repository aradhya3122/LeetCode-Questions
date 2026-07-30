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

# Solution1
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

# Solution2
## Approach: Dutch National Flag Algorithm

### Idea

Since the array contains only three distinct values (`0`, `1`, and `2`), there is no need to use a general sorting algorithm.

Maintain three pointers:

- `low` → Position where the next `0` should be placed.
- `mid` → Current element being processed.
- `high` → Position where the next `2` should be placed.

Process the array in a single traversal:

- If `nums[mid] == 0`, swap it with `nums[low]` and move both `low` and `mid` forward.
- If `nums[mid] == 1`, it is already in the correct position, so move `mid` forward.
- If `nums[mid] == 2`, swap it with `nums[high]` and decrement `high`. Do not increment `mid` because the swapped element must still be checked.

---

## Algorithm

1. Initialize three pointers:
   - `low = 0`
   - `mid = 0`
   - `high = nums.length - 1`
2. Traverse the array while `mid <= high`.
3. If the current element is:
   - `0`: Swap with `nums[low]`, increment both `low` and `mid`.
   - `1`: Increment `mid`.
   - `2`: Swap with `nums[high]`, decrement `high`.
4. Continue until `mid` crosses `high`.
5. The array is now sorted in-place.

---

## Time Complexity

**O(n)**

Each element is processed at most once.

## Space Complexity

**O(1)**

Sorting is performed in-place using only three pointers.

---

## Concepts Used

- Arrays
- Two Pointers
- Dutch National Flag Algorithm
- In-Place Sorting
- Single Pass Traversal