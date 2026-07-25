# 1423. Maximum Points You Can Obtain from Cards

**Difficulty:** Medium

## Problem Statement

There are several cards arranged in a row, and each card has an associated number of points.

You can take exactly `k` cards from either the beginning or the end of the row.

Return the maximum score you can obtain.

---

## Approach: Sliding Window / Two Pointers

### Idea

- Initially, consider taking all `k` cards from the left side.
- Then gradually remove cards from the left and replace them with cards from the right.
- At each step, calculate the total score obtained from the selected cards.
- Keep track of the maximum score encountered.

This allows us to consider all possible combinations of taking cards from the left and right ends without repeatedly calculating the total sum.

---

## Algorithm

1. Calculate the sum of the first `k` cards and store it in `leftSum`.
2. Initialize `maxSum` with `leftSum`.
3. Start a pointer `r` from the last index of the array.
4. Traverse from `k - 1` down to `0`:
   - Remove the current card from `leftSum`.
   - Add the card from the right end to `rightSum`.
   - Update `maxSum` with `leftSum + rightSum`.
5. Return `maxSum`.

---

## Time Complexity

**O(k)**

## Space Complexity

**O(1)**

---

## Concepts Used

- Arrays
- Sliding Window
- Two Pointers
- Prefix/Suffix Selection
- Greedy Approach