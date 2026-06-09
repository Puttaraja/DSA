# Dutch National Flag Algorithm

## Purpose
Sort an array containing only 0s, 1s, and 2s in O(n) time and O(1) space.

## Core Idea
Maintain three pointers:
- `low` → Next position for 0
- `mid` → Current element being processed
- `high` → Next position for 2

At any time:
- `0 ... low-1` → All 0s
- `low ... mid-1` → All 1s
- `mid ... high` → Unprocessed elements
- `high+1 ... n-1` → All 2s

## How It Works

### If arr[mid] == 0
The element belongs to the left partition.
Swap `low` and `mid`, then move both pointers forward.

### If arr[mid] == 1
The element is already in the correct partition.
Move `mid` forward.

### If arr[mid] == 2
The element belongs to the right partition.
Swap `mid` and `high`, then decrement `high`.
Do NOT increment `mid` because the incoming element has not been processed yet.

## Pseudo Code

Initialize low = 0, mid = 0, high = n - 1

While mid <= high:
    If arr[mid] == 0:
        Swap(low, mid)
        low++
        mid++

    Else if arr[mid] == 1:
        mid++

    Else:
        Swap(mid, high)
        high--

## Pitfalls
1. Never increment `mid` after handling a 2.
2. Use `mid <= high`, not `mid < high`.
3. Understand the partition invariant instead of memorizing swaps.

## Complexity
- Time: O(n)
- Space: O(1)

## Interview One-Liner
Dutch National Flag Algorithm maintains four regions (0s, 1s, unknown, and 2s) and continuously shrinks the unknown region until the array is sorted in a single traversal.


# Dutch National Flag Algorithm

## Overview

The Dutch National Flag Algorithm is an in-place partitioning technique used to sort or rearrange an array containing three distinct categories of elements.

The algorithm was proposed by computer scientist Edsger W. Dijkstra and is named after the three colors of the Dutch flag.

It is most commonly used for:

* Sorting an array containing only `0s`, `1s`, and `2s`
* Three-way partitioning problems
* Quick Sort optimizations
* Categorizing elements into three groups

---

# Problem Statement

Given an array containing only:

* 0 → Low category
* 1 → Medium category
* 2 → High category

Rearrange the array so that:

```text
All 0s come first
All 1s come next
All 2s come last
```

Example:

```text
Input:
[2, 0, 2, 1, 1, 0]

Output:
[0, 0, 1, 1, 2, 2]
```

---

# Core Idea

Instead of sorting the array using a traditional sorting algorithm, maintain three regions:

```text
0s Region
Unknown Region
2s Region
```

While traversing the array, gradually shrink the unknown region until every element is placed in its correct partition.

This is achieved using three pointers.

---

# Three Pointer Approach

Maintain:

| Pointer | Purpose                                  |
| ------- | ---------------------------------------- |
| low     | Next position where a 0 should be placed |
| mid     | Current element being examined           |
| high    | Next position where a 2 should be placed |

Initial state:

```text
low = 0
mid = 0
high = n - 1
```

---

# Invariant Maintained

At every iteration:

```text
0 to low-1      -> all 0s

low to mid-1    -> all 1s

mid to high     -> unknown elements

high+1 to n-1   -> all 2s
```

This invariant is the heart of the algorithm.

If this property is maintained after every operation, the algorithm is guaranteed to work.

---

# Visualization

Example:

```text
[2, 0, 2, 1, 1, 0]

 L
 M
                H
```

Regions:

```text
0s      : empty

1s      : empty

Unknown : entire array

2s      : empty
```

As elements are processed, the unknown region keeps shrinking.

---

# Processing Rules

## Case 1: Current Element is 0

Meaning:

```text
This element belongs to the left partition.
```

Action:

```text
Swap element at low and mid.

Increment low.

Increment mid.
```

Reason:

After swapping:

* 0 is correctly placed
* The element brought to mid is already processed because low and mid were aligned with valid partitions

Move both pointers forward.

---

## Case 2: Current Element is 1

Meaning:

```text
Already in correct partition.
```

Action:

```text
Increment mid only.
```

Reason:

1 belongs in the middle section.

No swapping is required.

---

## Case 3: Current Element is 2

Meaning:

```text
This element belongs to the right partition.
```

Action:

```text
Swap element at mid and high.

Decrement high.
```

Important:

```text
Do NOT increment mid.
```

Reason:

The element that comes from the high side has not been examined yet.

It could be:

* 0
* 1
* 2

Therefore it must be reprocessed.

---

# Why Mid is Not Incremented for 2

This is the most common interview question.

Consider:

```text
[2, 0, 1]
```

Current:

```text
mid = 0
high = 2
```

Swap:

```text
[1, 0, 2]
```

The new value at index mid is:

```text
1
```

It has never been examined.

If mid is incremented immediately after the swap, some elements may be skipped.

Hence:

```text
After handling 2:
    only high moves
```

---

# Pseudo Code

```text
Initialize:
    low = 0
    mid = 0
    high = n - 1

While mid <= high

    If element at mid is 0

        Swap(low, mid)

        low++
        mid++

    Else if element at mid is 1

        mid++

    Else

        Swap(mid, high)

        high--

End While
```

---

# Dry Run

Input:

```text
[2, 0, 2, 1, 1, 0]
```

Initial:

```text
low = 0
mid = 0
high = 5
```

### Step 1

```text
mid points to 2
```

Swap with high.

```text
[0, 0, 2, 1, 1, 2]

high = 4
```

Do not move mid.

---

### Step 2

```text
mid points to 0
```

Swap low and mid.

```text
[0, 0, 2, 1, 1, 2]

low = 1
mid = 1
```

---

### Step 3

```text
mid points to 0
```

Swap low and mid.

```text
[0, 0, 2, 1, 1, 2]

low = 2
mid = 2
```

---

### Step 4

```text
mid points to 2
```

Swap with high.

```text
[0, 0, 1, 1, 2, 2]

high = 3
```

mid remains same.

---

### Step 5

```text
mid points to 1
```

Move mid.

```text
mid = 3
```

---

### Step 6

```text
mid points to 1
```

Move mid.

```text
mid = 4
```

Loop terminates.

Output:

```text
[0, 0, 1, 1, 2, 2]
```

---

# Complexity Analysis

## Time Complexity

```text
O(n)
```

Reason:

Each element is processed at most once.

The pointers only move forward or inward.

---

## Space Complexity

```text
O(1)
```

Reason:

Only three pointers are used.

No additional data structure is required.

---

# Common Pitfalls

## 1. Incrementing Mid After Handling 2

Wrong:

```text
Swap(mid, high)

high--

mid++
```

Problem:

New element at mid is never checked.

Can produce incorrect results.

---

## 2. Incorrect Loop Condition

Wrong:

```text
while(mid < high)
```

Correct:

```text
while(mid <= high)
```

Reason:

The final unknown element must also be processed.

---

## 3. Not Understanding the Invariant

Many candidates memorize the algorithm without understanding:

```text
0-region
1-region
unknown-region
2-region
```

Understanding these regions makes the algorithm easy to reconstruct during interviews.

---

## 4. Using Sorting Instead

A common beginner approach:

```text
Use Arrays.sort()
```

This works but misses the purpose of the problem.

Interviewers expect:

```text
O(n) time
O(1) space
```

---

## 5. Confusing Low and Mid

Remember:

```text
low -> boundary of 0s

mid -> current element under examination
```

They may point to the same location initially but have different responsibilities.

---

# Interview Discussion Points

Be prepared to answer:

### Why is the algorithm O(n)?

Because every iteration reduces the unknown region.

---

### Why is the algorithm in-place?

No auxiliary array is used.

---

### Why isn't mid incremented after processing a 2?

The incoming element from the right side remains unclassified.

---

### What invariant is maintained?

```text
[0 ... low-1]       => 0s

[low ... mid-1]     => 1s

[mid ... high]      => Unknown

[high+1 ... n-1]    => 2s
```

---

# Applications

## Sort Colors Problem

Most famous application:

```text
Sort an array containing 0s, 1s and 2s.
```

---

## Three-Way Partitioning

Partition values into:

```text
Less than pivot

Equal to pivot

Greater than pivot
```

Used in optimized Quick Sort implementations.

---

## Categorization Problems

Useful whenever elements belong to exactly three categories.

Examples:

```text
Negative / Zero / Positive

Low / Medium / High Priority

Fail / Pass / Distinction
```

---

# Key Takeaways

1. Maintain three regions using low, mid, and high.
2. The unknown region shrinks every iteration.
3. Increment mid for 0 and 1.
4. Do not increment mid for 2.
5. Maintain the partition invariant throughout execution.
6. Achieves O(n) time and O(1) space.
7. Commonly asked in coding interviews and forms the basis for three-way partitioning techniques.
