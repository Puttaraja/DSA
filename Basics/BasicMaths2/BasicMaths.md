# 📘 BasicMaths2 – Utility Methods in Java

This document explains all the methods in the `BasicMaths2` class.

---

## 1. `generateRandomNumber(int lower, int upper)`
- **Description**: Generates a random integer between `lower` and `upper` (inclusive).  
- **Logic**: Uses `Math.random()` which gives a value in `[0,1)`, scales it to the range.  
- **Time Complexity**: `O(1)`

---

## 2. `sumOfDigitsOfNumber(int num)`
- **Description**: Computes the sum of digits of a number.  
- **Logic**: Extract digits using `% 10`, add them, then remove digit using `/ 10`.  
- **Example**: `1234 → 1+2+3+4 = 10`  
- **Time Complexity**: `O(log10(n))` (depends on number of digits)

---

## 3. `reverseANumber(int num)`
- **Description**: Reverses the digits of a number.  
- **Logic**: Take last digit using `% 10`, append it to result, shrink number using `/ 10`.  
- **Example**: `123 → 321`  
- **Time Complexity**: `O(log10(n))`

---

## 4. `isPrimeNumber(int num)`
- **Description**: Checks if a number is prime.  
- **Logic**:
  - Handle small cases (≤ 3).  
  - Eliminate even numbers and multiples of 3.  
  - Then check divisibility using `6k ± 1` rule up to √n.  
- **Time Complexity**: `O(√n)`

---

## 5. `isPowerOfANumberNaive(int num, int base)`
- **Description**: Checks if `num` is a power of `base` using repeated division.  
- **Logic**: Divide `num` by `base` while divisible, check if result is `1`.  
- **Example**: `8, base=2 → 8 → 4 → 2 → 1 → true`  
- **Time Complexity**: `O(log₍base₎(num))`

---

## 6. `isPowerOfANumberEfficient(int num, int base)`
- **Description**: Efficient check using **exponential growth + binary search**.  
- **Logic**:
  - Multiply powers of `base` exponentially until ≥ `num`.  
  - If overshoot, perform binary search in that range.  
- **Time Complexity**: `O(log²(num))` (because each power check uses `Math.pow`)  

---

## 7. `isPowerOfANumberMostEfficient(int num, int base)`
- **Description**: Checks if `num` is a power of `base` using logarithms.  
- **Logic**: Compute `log(num) / log(base)` and check if the result is an integer.  
- **Time Complexity**: `O(1)` (depends on floating-point precision)

---

## 8. `getDistanceOfTwoPoints(int x1, int x2, int y1, int y2)`
- **Description**: Computes the Euclidean distance between two points `(x1, y1)` and `(x2, y2)`.  
- **Formula**:  
  \[
  \sqrt{(x2 - x1)^2 + (y2 - y1)^2}
  \]  
- **Time Complexity**: `O(1)`

---

## 9. `isValidTriangle(int a, int b, int c)`
- **Description**: Checks if three sides can form a valid triangle.  
- **Logic**: Follows **triangle inequality theorem**:  
  - `a + b > c`, `a + c > b`, `b + c > a`  
- **Time Complexity**: `O(1)`

---

## 10. `isObtuseTriangle(int a, int b, int c)`
- **Description**: Checks if a triangle is **obtuse-angled**.  
- **Logic**: A triangle is obtuse if:  
  \[
  a^2 + b^2 + c^2 < 2 \times (\text{max side})^2
  \]  
- **Time Complexity**: `O(1)`

---

## 11. `isAcuteTriangle(int a, int b, int c)`
- **Description**: Checks if a triangle is **acute-angled**.  
- **Logic**: A triangle is acute if:  
  \[
  a^2 + b^2 + c^2 > 2 \times (\text{max side})^2
  \]  
- **Time Complexity**: `O(1)`

---

## 12. `isRightAngledTriangle(int a, int b, int c)`
- **Description**: Checks if a triangle is **right-angled** (Pythagoras theorem).  
- **Logic**: A triangle is right-angled if:  
  \[
  a^2 + b^2 + c^2 = 2 \times (\text{max side})^2
  \]  
- **Time Complexity**: `O(1)`

---

## 13. `doRectanglesOverlap(Point l1, Point r1, Point l2, Point r2)`
- **Description**: Checks if two rectangles overlap.  
- **Logic**:
  - If one rectangle is completely to the left or right → no overlap.  
  - If one rectangle is completely above or below → no overlap.  
- **Time Complexity**: `O(1)`

---

## 14. `factorialOfNumber(int num)`
- **Description**: Computes the factorial of a number (`n!`).  
- **Logic**: Multiply numbers from 1 to `n`.  
- **Example**: `5! = 1×2×3×4×5 = 120`  
- **Time Complexity**: `O(n)`

---

## 15. `gcdOfTwoNumbersIterationMethod(int a, int b)`
- **Description**: Computes the Greatest Common Divisor (GCD) using the **iterative Euclidean Algorithm**.  
- **Logic**: Keep replacing `(a, b)` with `(b, a % b)` until `b = 0`. Return `a`.  
- **Time Complexity**: `O(log(min(a, b)))`

---

# ✅ Summary Table

| Method                                | Purpose                                 | Time Complexity |
|---------------------------------------|-----------------------------------------|----------------|
| generateRandomNumber                  | Random number in range                  | O(1)           |
| sumOfDigitsOfNumber                   | Sum of digits                           | O(log n)       |
| reverseANumber                        | Reverse digits                          | O(log n)       |
| isPrimeNumber                         | Prime check                             | O(√n)          |
| isPowerOfANumberNaive                 | Power check (division)                  | O(log n)       |
| isPowerOfANumberEfficient             | Power check (binary search)             | O(log² n)      |
| isPowerOfANumberMostEfficient         | Power check (logarithm)                 | O(1)           |
| getDistanceOfTwoPoints                | Distance between two points             | O(1)           |
| isValidTriangle                       | Check triangle validity                 | O(1)           |
| isObtuseTriangle                      | Check obtuse triangle                   | O(1)           |
| isAcuteTriangle                       | Check acute triangle                    | O(1)           |
| isRightAngledTriangle                 | Check right-angled triangle             | O(1)           |
| doRectanglesOverlap                   | Rectangle overlap check                 | O(1)           |
| factorialOfNumber                     | Factorial computation                   | O(n)           |
| gcdOfTwoNumbersIterationMethod        | Greatest Common Divisor (iterative)     | O(log n)       |
