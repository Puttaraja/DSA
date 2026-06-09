# Moore's Voting Algorithm

## Purpose
Find the Majority Element (appears more than n/2 times) in O(n) time and O(1) space.

## Core Idea
Different elements cancel each other out. Since the majority element appears more than all other elements combined, it survives the cancellations.

## Variables
- `candidate` → Potential majority element
- `count` → Vote balance

## Pseudo Code

Initialize candidate = null, count = 0

For each element:
    If count == 0:
        candidate = element
        count = 1
    Else if element == candidate:
        count++
    Else:
        count--

Verify candidate frequency in a second pass.

## Pitfalls
1. Do not skip the verification pass unless the problem guarantees a majority element exists.
2. `count` is not the actual frequency; it represents vote balance.
3. Change candidate only when `count == 0`.

## Complexity
- Time: O(n)
- Space: O(1)


# Moore's Voting Algorithm

## Overview

Moore's Voting Algorithm is an efficient technique used to find the **Majority Element** in an array.

A Majority Element is an element that appears **more than n/2 times** in an array of size n.

The algorithm works in:

```text
Time Complexity  : O(n)
Space Complexity : O(1)
```

without using any additional data structures such as HashMaps.

---

# Problem Statement

Given an array of size n, find the element that appears more than:

```text
n / 2
```

times.

Example:

```text
Input:
[2, 2, 1, 1, 1, 2, 2]

Output:
2
```

Frequency:

```text
2 -> 4 times
1 -> 3 times

n = 7

4 > 7/2
```

Therefore:

```text
Majority Element = 2
```

---

# Key Observation

If an element occurs more than half the time, then:

```text
All other elements combined
cannot completely cancel it out.
```

Example:

```text
[2, 2, 2, 1, 1]
```

Count:

```text
2 -> 3
1 -> 2
```

Even if every 1 cancels one 2:

```text
2 2 2
1 1

Cancel:

2 2 2
X X

Remaining:

2
```

A majority element will always survive pairwise cancellation.

This is the core idea behind Moore's Voting Algorithm.

---

# Intuition

Imagine an election.

Every occurrence of an element is considered a vote.

When two different elements meet:

```text
One vote from each is cancelled.
```

Since the majority element has more votes than all others combined, it will remain at the end.

---

# Candidate and Count

The algorithm maintains:

| Variable  | Purpose                            |
| --------- | ---------------------------------- |
| candidate | Current potential majority element |
| count     | Vote balance                       |

Initially:

```text
candidate = undefined
count = 0
```

---

# Voting Rules

## Case 1: Count Becomes Zero

When:

```text
count == 0
```

Choose current element as the new candidate.

Reason:

Previous candidate has been completely cancelled.

Start fresh with the current element.

---

## Case 2: Current Element Equals Candidate

Increase count.

```text
count++
```

Reason:

Candidate gains support.

---

## Case 3: Current Element Differs From Candidate

Decrease count.

```text
count--
```

Reason:

Current element cancels one vote of the candidate.

---

# Why It Works

Suppose majority element is:

```text
M
```

Frequency:

```text
freq(M) > n/2
```

All non-majority elements together appear:

```text
n - freq(M)
```

times.

Since:

```text
freq(M) > n - freq(M)
```

the majority element has enough occurrences to survive all possible cancellations.

Thus, after the first pass, the surviving candidate must be the majority element (if one exists).

---

# Pseudo Code

## Phase 1: Find Candidate

```text
candidate = undefined
count = 0

For each element x

    If count == 0

        candidate = x
        count = 1

    Else if x == candidate

        count++

    Else

        count--

Return candidate
```

---

# Important Verification Step

The first pass only finds a:

```text
Potential Majority Element
```

It does NOT guarantee that a majority element actually exists.

Therefore:

```text
A second pass is required.
```

Count the occurrences of the candidate.

If:

```text
frequency(candidate) > n/2
```

return candidate.

Otherwise:

```text
No Majority Element Exists
```

---

# Dry Run

Input:

```text
[2, 2, 1, 1, 1, 2, 2]
```

Initial:

```text
candidate = undefined
count = 0
```

---

### Element = 2

```text
count = 0
```

Choose candidate.

```text
candidate = 2
count = 1
```

---

### Element = 2

Same candidate.

```text
count = 2
```

---

### Element = 1

Different element.

```text
count = 1
```

---

### Element = 1

Different element.

```text
count = 0
```

Candidate completely cancelled.

---

### Element = 1

Choose new candidate.

```text
candidate = 1
count = 1
```

---

### Element = 2

Different element.

```text
count = 0
```

Again cancelled.

---

### Element = 2

Choose new candidate.

```text
candidate = 2
count = 1
```

Final:

```text
candidate = 2
```

Verification confirms:

```text
2 appears 4 times
```

Result:

```text
Majority Element = 2
```

---

# Visualization of Cancellation

Array:

```text
[2, 2, 1, 1, 1, 2, 2]
```

Pair cancellations:

```text
2 cancels 1
2 cancels 1
```

Remaining:

```text
1 2 2
```

Further cancellation:

```text
1 cancels 2
```

Remaining:

```text
2
```

The majority element survives.

---

# Why a Second Pass is Needed

Consider:

```text
[1, 2, 3, 4]
```

No majority element exists.

Running Moore's Voting Algorithm may produce:

```text
candidate = 4
```

But:

```text
frequency(4) = 1
```

which is not greater than:

```text
n/2
```

Therefore:

```text
candidate ≠ guaranteed majority
```

Verification is mandatory unless the problem explicitly guarantees a majority element exists.

---

# Common Pitfalls

## 1. Forgetting Verification Pass

Most common mistake.

Wrong assumption:

```text
Candidate = Majority Element
```

Correct:

```text
Candidate = Potential Majority Element
```

Always verify unless the problem guarantees existence.

---

## 2. Misunderstanding Count

Count does NOT represent:

```text
Actual frequency
```

It represents:

```text
Vote balance
```

between candidate and non-candidate elements.

---

## 3. Resetting Candidate Incorrectly

Candidate should change only when:

```text
count == 0
```

Changing it at other times breaks the logic.

---

## 4. Assuming Works for Maximum Frequency Element

Moore's Voting finds:

```text
Element occurring > n/2 times
```

It does NOT find:

```text
Most frequent element
```

Example:

```text
[1, 1, 2, 2, 3]
```

Most frequent element exists.

Majority element does not.

Moore's Voting cannot solve this directly.

---

## 5. Ignoring Edge Cases

Examples:

```text
[]
```

```text
[5]
```

```text
[1, 2]
```

```text
[1, 1]
```

These should be considered separately.

---

# Complexity Analysis

## Time Complexity

Phase 1:

```text
O(n)
```

Phase 2:

```text
O(n)
```

Overall:

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

Only candidate and count variables are used.

---

# Comparison with HashMap Approach

| Approach                | Time | Space |
| ----------------------- | ---- | ----- |
| HashMap Frequency Count | O(n) | O(n)  |
| Moore's Voting          | O(n) | O(1)  |

Advantage of Moore's Voting:

```text
Constant space
```

Advantage of HashMap:

```text
Works for all frequency problems
```

---

# Interview Questions

## Why does Moore's Voting work?

Because a majority element occurs more times than all other elements combined and therefore survives pairwise cancellation.

---

## Why is verification needed?

The first pass only identifies a candidate.

A majority element may not exist.

---

## What does count represent?

Vote balance after cancellations.

Not actual frequency.

---

## Can Moore's Voting find the most frequent element?

No.

It only works when searching for an element occurring more than:

```text
n/2
```

times.

---

## Can it be extended?

Yes.

A variation can find elements appearing more than:

```text
n/3
```

times.

This requires:

```text
Two candidates
Two counters
```

This is a common interview follow-up.

---

# Applications

## Majority Element Problem

Most common usage.

---

## Election Winner Analysis

Determine whether a candidate has absolute majority.

---

## Stream Processing

Can identify majority candidates while processing large data streams.

---

## Boyer-Moore Family of Algorithms

Moore's Voting is often referred to as the Boyer-Moore Majority Vote Algorithm and serves as a foundation for generalized majority-frequency problems.

---

# Key Takeaways

1. Majority Element appears more than n/2 times.
2. Different elements cancel each other.
3. Maintain candidate and count.
4. Count represents vote balance, not frequency.
5. First pass finds a candidate.
6. Second pass verifies the candidate.
7. Time Complexity = O(n).
8. Space Complexity = O(1).
9. Works because a true majority survives all cancellations.
10. One of the most important array algorithms for coding interviews.



