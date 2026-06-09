# Kadane's Algorithm

## Purpose

Find the **Maximum Sum Contiguous Subarray** in O(n) time and O(1) space.

## Core Idea

At each element, decide whether to:

* Start a new subarray from the current element.
* Extend the previous subarray.

Choose whichever gives a larger sum.

## Variables

* `currentSum` → Maximum subarray sum ending at current index.
* `maxSum` → Maximum subarray sum found so far.

## How It Works

For every element:

```text
currentSum = max(element, currentSum + element)
maxSum = max(maxSum, currentSum)
```

If extending the previous subarray is worse than starting fresh, begin a new subarray from the current element.

## Pseudo Code

```text
currentSum = arr[0]
maxSum = arr[0]

For i = 1 to n-1

    currentSum = max(arr[i], currentSum + arr[i])

    maxSum = max(maxSum, currentSum)

Return maxSum
```

## Example

```text
Input:
[-2,1,-3,4,-1,2,1,-5,4]

Maximum Subarray:
[4,-1,2,1]

Output:
6
```

## Pitfalls

1. Do not initialize `maxSum` to 0; it fails for all-negative arrays.
2. `currentSum` represents the best subarray ending at the current index, not the overall answer.
3. Update `maxSum` every iteration.

## Complexity

* Time: O(n)
* Space: O(1)

## Interview One-Liner

Kadane's Algorithm keeps track of the best subarray ending at each index and chooses between extending the current subarray or starting a new one, producing the maximum subarray sum in a single pass.
