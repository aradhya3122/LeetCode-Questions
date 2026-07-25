# 3536. Maximum Product of Two Digits

**Difficulty:** Easy

## Problem Statement

You are given a positive integer `n`.

Return the maximum product of any two digits in `n`.

---

## Approach: Extract Digits and Check All Pairs

### Idea

- Extract each individual digit from the number using the modulo (`%`) and division (`/`) operators.
- Store the extracted digits in an array.
- Use nested loops to consider every possible pair of digits.
- Calculate the product of each pair and keep track of the maximum product.

---

## Algorithm

1. Create an array to store the digits of `n`.
2. Extract the last digit using `n % 10`.
3. Store the digit in the array.
4. Remove the last digit using `n / 10`.
5. Repeat until all digits are extracted.
6. Use nested loops to iterate through every pair of digits.
7. Calculate the product of each pair.
8. Update `maxProd` whenever a larger product is found.
9. Return `maxProd`.

---

## Time Complexity

**O(d²)**

Where `d` is the number of digits in `n`.

## Space Complexity

**O(d)**

Where `d` is the number of digits stored in the array.

---

## Concepts Used

- Number Manipulation
- Arrays
- Nested Loops
- Modulo Operator (`%`)
- Integer Division
- Pairwise Comparison