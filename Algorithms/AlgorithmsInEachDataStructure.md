# DSA Algorithms Roadmap

## Legend

🔴 = Must Know

🟡 = Important

🟢 = Advanced / Good to Know

---

# 1. Arrays Algorithms

## Algorithms

🔴 Linear Search

* Search element sequentially.
* Time Complexity: O(n)

🔴 Binary Search

* Search in sorted array.
* Time Complexity: O(log n)

🔴 Prefix Sum

* Precompute cumulative sums.
* Useful for range queries.

🔴 Kadane's Algorithm

* Maximum Subarray Sum.
* Time Complexity: O(n)

🔴 Moore Voting Algorithm

* Find majority element.
* Time Complexity: O(n)

🟡 Dutch National Flag Algorithm

* Sort 0s, 1s and 2s.
* Three pointer approach.
* Time Complexity: O(n)

---

# 2. String Algorithms

## Algorithms

🔴 KMP (Knuth-Morris-Pratt)

* Pattern matching.
* Uses LPS array.
* Time Complexity: O(n + m)

🔴 Rabin Karp

* Rolling Hash based matching.
* Average Time Complexity: O(n + m)

🟡 Z Algorithm

* Pattern matching.
* Builds Z-array.
* Time Complexity: O(n)

---

# 3. Linked List Algorithms

## Algorithms

🔴 Floyd Cycle Detection

Also called:

* Fast & Slow Pointer Algorithm
* Tortoise and Hare Algorithm

Applications:

* Detect cycle
* Find cycle start
* Find middle node

Time Complexity:

O(n)

---

🔴 Reverse Linked List

Methods:

* Iterative
* Recursive

Time Complexity:

O(n)

---

# 4. Stack Algorithms

## Algorithms

🔴 Next Greater Element

Applications:

* Stock Span
* Histogram Problems
* Monotonic Stack

Time Complexity:

O(n)

---

🔴 Monotonic Stack

Types:

* Increasing Stack
* Decreasing Stack

Applications:

* Next Greater Element
* Previous Smaller Element
* Largest Rectangle Histogram

Time Complexity:

O(n)

---

# 5. Queue Algorithms

## Algorithms

🔴 Sliding Window Maximum

Uses:

* Deque

Applications:

* Maximum in every window

Time Complexity:

O(n)

---

# 6. Trees Algorithms

## Algorithms

🔴 DFS (Depth First Search)

Traversals:

* Preorder
* Inorder
* Postorder

Implementation:

* Recursion
* Stack

Time Complexity:

O(n)

---

🔴 BFS (Breadth First Search)

Traversal:

* Level Order

Implementation:

* Queue

Time Complexity:

O(n)

---

# 7. Binary Search Tree Algorithms

## Algorithms

🔴 BST Validation

Checks:

* Left < Root < Right

Time Complexity:

O(n)

---

🔴 BST Delete

Cases:

1. Leaf Node
2. One Child
3. Two Children

Time Complexity:

O(h)

where h = tree height

---

# 8. Heap Algorithms

## Algorithms

🔴 Heapify

Purpose:

* Convert array into heap

Time Complexity:

O(n)

---

🔴 Priority Queue

Operations:

* Insert
* Delete
* Peek

Time Complexity:

Insert:

O(log n)

Delete:

O(log n)

Peek:

O(1)

---

🔴 Heap Sort

Steps:

1. Build Heap
2. Repeatedly Extract Root

Time Complexity:

O(n log n)

Space Complexity:

O(1)

---

# 9. Trie Algorithms

## Algorithms

🔴 Prefix Matching

Applications:

* Dictionary
* Search Engine

Time Complexity:

O(length)

---

🔴 Auto Complete

Steps:

1. Find Prefix
2. DFS Traversal

Applications:

* Google Search
* IDE Suggestions

Time Complexity:

O(P + K)

P = Prefix Length

K = Suggestions Generated

---

# 10. Graph Algorithms

## Algorithms

🔴 DFS

Applications:

* Connected Components
* Cycle Detection
* Topological Sort

Time Complexity:

O(V + E)

---

🔴 BFS

Applications:

* Shortest Path (Unweighted Graph)
* Level Traversal

Time Complexity:

O(V + E)

---

🔴 Dijkstra Algorithm

Purpose:

* Shortest Path

Requirements:

* Non-negative weights

Data Structure:

* Min Heap

Time Complexity:

O((V + E) log V)

---

🔴 Union Find (Disjoint Set)

Operations:

* Find
* Union

Optimizations:

* Path Compression
* Union by Rank

Applications:

* Cycle Detection
* Kruskal MST

Time Complexity:

Nearly O(1)

---

🔴 Topological Sort

Methods:

1. DFS Based
2. Kahn's Algorithm

Applications:

* Dependency Resolution
* Build Systems
* Course Schedule

Time Complexity:

O(V + E)

---
