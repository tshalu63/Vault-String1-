# 🚀 Essential String & Stack Algorithms

An interview-focused collection of string and stack problems, featuring both intuitive brute-force methods and highly optimized solutions.

## 📋 Problem Set & Explanations

### 1. Parenthesis Checker
*   **Brute Force:** Repeatedly replace pairs of matching brackets (e.g., `()`, `[]`, `{}`) with an empty string until no matches remain.
    *   **Complexity:** $O(n^2)$ Time | $O(n)$ Space.
*   **Optimized (Stack):** Traverse the string once, pushing opening brackets onto a **Stack**. For every closing bracket, pop and verify the match.
    *   **Complexity:** $O(n)$ Time | $O(n)$ Space.
*   **Key Insight:** The stack's LIFO (Last-In, First-Out) nature perfectly mirrors the nested structure of parentheses.

### 2. Palindrome String
*   **Brute Force:** Reverse the entire string into a new memory location and compare it with the original.
    *   **Complexity:** $O(n)$ Time | $O(n)$ Space.
*   **Optimized (Two Pointers):** Compare characters at `start` and `end` indices, moving toward the center.
    *   **Complexity:** $O(n)$ Time | $O(1)$ Space.
*   **Key Insight:** Avoiding string reversal saves $O(n)$ auxiliary space.

### 3. Anagram Checker
*   **Brute Force:** Sort both strings alphabetically and compare them character by character.
    *   **Complexity:** $O(n \log n)$ Time | $O(1)$ Space.
*   **Optimized (Frequency Hash Map):** Use a fixed-size integer array (size 26 for lowercase) to count character occurrences in one pass.
    *   **Complexity:** $O(n)$ Time | $O(1)$ Space.
*   **Key Insight:** Counting is faster than sorting when the character set (alphabet) is limited.

### 4. Reverse String
*   **Brute Force:** Create a new string and append characters from the original string starting from the last index.
    *   **Complexity:** $O(n)$ Time | $O(n)$ Space.
*   **Optimized (In-place Swap):** Use two pointers at the boundaries to swap characters until they meet in the middle.
    *   **Complexity:** $O(n)$ Time | $O(1)$ Space.

### 5. Reverse Words in a String
*   **Brute Force:** Split the string by spaces into an array, reverse the array, and join it back.
    *   **Complexity:** $O(n)$ Time | $O(n)$ Space.
*   **Optimized (Double Reverse):** 
    1. Reverse the entire string.
    2. Traverse the string and reverse each individual word back to its original form.
    *   **Complexity:** $O(n)$ Time | $O(1)$ Space (if modifying a character array in-place).

## 🛠️ Usage
1. Clone the repository.
2. Navigate to the problem directory.
3. Run the solution:
   ```bash
   python solution.py  # or node solution.js
