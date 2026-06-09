# Day 1 - Arrays (10 Standard Problems)

---

# 1. Find Largest Element

## Problem Statement

Given an array of integers, find the largest element in the array.

### Example

Input:

```text
[5, 2, 9, 1, 7]
```

Output:

```text
9
```

### Constraints

```text
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9
```

## Approaches

### Approach 1: Linear Scan

Traverse the array and keep track of the maximum element seen so far.

#### Key Insight

Keep updating the maximum whenever a larger element is found.

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

### Approach 2: Sorting

Sort the array and return the last element.

#### Time Complexity

```text
O(n log n)
```

#### Space Complexity

Depends on sorting algorithm.

#### Why Not Preferred?

Sorting does unnecessary work when only the largest element is needed.

---

# 2. Second Largest Element

## Problem Statement

Find the second largest distinct element in the array.

### Example

Input:

```text
[12, 35, 1, 10, 34, 1]
```

Output:

```text
34
```

### Constraints

```text
1 <= n <= 10^5
```

## Approaches

### Approach 1: Two Variable Tracking

Maintain:

```text
largest
secondLargest
```

#### Key Insight

Whenever a new largest is found:

```text
secondLargest = largest
largest = currentElement
```

#### Edge Cases

* Array contains one element
* All elements are equal
* Negative numbers
* Distinct vs non-distinct second largest

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# 3. Remove Duplicates From Sorted Array

## Problem Statement

Remove duplicates in-place from a sorted array and return the count of unique elements.

### Example

Input:

```text
[1,1,2,2,3]
```

Output:

```text
3
```

Modified Array:

```text
[1,2,3,...]
```

## Approach

### Two Pointers

#### Key Insight

* First pointer tracks unique region.
* Second pointer explores array.

Whenever a new unique value is found:

```text
place it at first + 1
```

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# 4. Move Zeroes

## Problem Statement

Move all zeroes to the end while maintaining relative order of non-zero elements.

### Example

Input:

```text
[0,1,0,3,12]
```

Output:

```text
[1,3,12,0,0]
```

## Approaches

### Approach 1: Rewrite Non-Zero Elements

#### Key Insight

Maintain:

```text
nonZeroIndex
```

Place non-zero elements at the next available position.

Fill remaining positions with zeroes.

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

### Optimization

Avoid unnecessary writes when:

```text
i == nonZeroIndex
```

---

# 5. Missing Number

## Problem Statement

Given an array containing numbers from:

```text
0 to n
```

with one number missing, find the missing number.

### Example

Input:

```text
[3,0,1]
```

Output:

```text
2
```

## Approaches

### Approach 1: Sum Formula

Expected Sum:

```text
n * (n + 1) / 2
```

Missing Number:

```text
expectedSum - actualSum
```

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

### Approach 2: XOR

#### Key Insight

```text
x ^ x = 0
```

All matching numbers cancel.

Remaining value is the missing number.

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

### Approach 3: Cyclic Sort

#### Key Insight

Each number belongs to its correct index.

After placement, first mismatch indicates missing number.

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# 6. Two Sum

## Problem Statement

Find two indices whose values add up to target.

### Example

Input:

```text
nums = [2,7,11,15]
target = 9
```

Output:

```text
[0,1]
```

## Approaches

### Approach 1: Brute Force

Check all pairs.

#### Time Complexity

```text
O(n²)
```

#### Space Complexity

```text
O(1)
```

---

### Approach 2: HashMap

Store:

```text
value -> index
```

Look for:

```text
target - currentValue
```

#### Key Insight

For every element:

```text
Have I already seen its complement?
```

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(n)
```

---

# 7. Best Time To Buy And Sell Stock

## Problem Statement

Perform one buy and one sell operation to maximize profit.

### Example

Input:

```text
[7,1,5,3,6,4]
```

Output:

```text
5
```

## Approach

### Running Minimum

#### Key Insight

Maintain:

```text
minPrice
maxProfit
```

At each day:

```text
profit = currentPrice - minPrice
```

Update:

```text
maxProfit
```

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# 8. Maximum Subarray

## Problem Statement

Find the contiguous subarray having maximum sum.

### Example

Input:

```text
[-2,1,-3,4,-1,2,1,-5,4]
```

Output:

```text
6
```

Subarray:

```text
[4,-1,2,1]
```

## Approach

### Kadane's Algorithm

#### Key Insight

Negative running sums hurt future subarrays.

If extending a subarray is worse than starting fresh:

```text
start fresh
```

#### Initialization

```text
currentSum = arr[0]
maxSum = arr[0]
```

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# 9. Majority Element

## Problem Statement

Find the element appearing more than:

```text
n / 2
```

times.

### Example

Input:

```text
[2,2,1,1,1,2,2]
```

Output:

```text
2
```

## Approach

### Moore Voting Algorithm

#### Key Insight

Different elements cancel each other.

Maintain:

```text
candidate
count
```

#### Rules

Same candidate:

```text
count++
```

Different candidate:

```text
count--
```

When:

```text
count == 0
```

choose a new candidate.

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# 10. Dutch National Flag

## Problem Statement

Sort an array containing only:

```text
0
1
2
```

### Example

Input:

```text
[2,0,2,1,1,0]
```

Output:

```text
[0,0,1,1,2,2]
```

## Approach

### Three Pointers

Maintain:

```text
low
mid
high
```

Regions:

```text
[0 ... low-1] -> 0s

[low ... mid-1] -> 1s

[mid ... high] -> unknown

[high+1 ... end] -> 2s
```

#### Key Insight

When:

```text
nums[mid] == 2
```

Swap with high.

Do NOT move mid.

The incoming value has not been processed.

#### Time Complexity

```text
O(n)
```

#### Space Complexity

```text
O(1)
```

---

# Day 1 Patterns Learned

```text
Traversal
State Tracking
Two Pointers
Three Pointers
HashMap
Running Minimum
Kadane's Algorithm
Moore Voting Algorithm
Math Formula
XOR
Cyclic Sort
```
