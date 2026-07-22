# 9. Palindrome Number

**Difficulty:** Easy

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same backward as forward.

### Example

```text
Input: x = 121
Output: true

Input: x = -121
Output: false
```

---

## Approach: Reverse the Number

### Idea

- Negative numbers cannot be palindromes because of the negative sign.
- Store the original number.
- Reverse the digits of the number using the remainder operator `%`.
- Compare the reversed number with the original number.
- If both are equal, the number is a palindrome.

---

## Algorithm

1. If `x` is negative, return `false`.
2. Store the original value of `x`.
3. Extract the last digit using `x % 10`.
4. Build the reversed number by multiplying the current reversed number by `10` and adding the extracted digit.
5. Remove the last digit using integer division by `10`.
6. Repeat until all digits are processed.
7. Compare the reversed number with the original number.
8. Return the result.

---

## Time Complexity

**O(log n)**

## Space Complexity

**O(1)**

---

## Concepts Used

- Number Manipulation
- Modulo Operator (`%`)
- Integer Division
- Palindrome