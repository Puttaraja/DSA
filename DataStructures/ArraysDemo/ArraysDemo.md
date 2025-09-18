# 📘 Arrays in Java

Arrays are one of the most fundamental data structures in Java. They allow storing **multiple elements of the same type** in a contiguous block of memory.

---

## 🔹 Definition
An **array** in Java is a collection of elements of the same type stored in contiguous memory locations.  
- Each element is accessed using an **index**.  
- Indices in Java arrays are **zero-based** (first element is at index `0`).  
- Arrays are **objects** in Java, created dynamically.

---

### 🔹 Declaration and Initialization
```java
int[] arr;       // Preferred style
int arr[];       // Also valid, but less common
arr = new int[5];  // Creates an array of size 5 (all elements default to 0)
```

### 🔹 Properties of Arrays

- Fixed size – once created, size cannot be changed.
- Homogeneous elements – all elements must be of the same type.
- Stored in contiguous memory.
- Access time is O(1) – direct access using index.

### 🔹 Default values:

- 0 for numeric types
- false for boolean
- null for objects

### 🔹 Features

- Supports both primitive and object references.
- Fast random access using indices.
- Can be multi-dimensional (arrays of arrays).

### 🔹 Limitations

- Fixed size → cannot grow/shrink dynamically.
- No built-in bounds checking beyond runtime exception.
- Insertion/deletion in the middle requires shifting elements → costly (O(n)).
- Not directly iterable without a loop.

### ✅ Why ArrayList Instead of Arrays?

-Dynamic resizing → grows automatically as you add elements.
-Built-in methods (add, remove, contains, set, size) make life easier.
-No need to manually track length (use .size() instead).

### Tips
- ⚡ constant-time random access and dynamic resizing, use ArrayList.
- ⚡ fixed size and efficiency, stick with arrays.

### ✅ Key Points using Collections

- Use Collections.sort() for sorting.
- Use Collections.binarySearch() for efficient searching (O(log n)) but only after sorting.
- For unsorted lists, .contains() or .indexOf() is enough (O(n)).

------

## 🔹 Common Use Cases

1. **Storing Multiple Values of Same Type**
   - Keep track of a collection of elements (e.g., marks of students, daily temperatures).
   - Fixed size, fast access.

2. **Searching**
   - Linear Search (`O(n)`).
   - Binary Search (`O(log n)`) on sorted arrays.

3. **Sorting**
   - Algorithms like QuickSort, MergeSort, HeapSort often rely on arrays.
   - Arrays are preferred due to cache-friendliness and sequential storage.

4. **Prefix Sum & Suffix Sum**
   - Efficient range queries (e.g., sum of elements between indices `l` and `r`).
   - Used in problems like **subarray sums**, **maximum sum queries**.

5. **Sliding Window Problems**
   - Find max/min/sum in a subarray of fixed or variable size.
   - Examples:
     - Maximum sum subarray of size `k`.
     - Smallest subarray with sum ≥ target.

6. **Hashing via Indexing**
   - Frequency count arrays (e.g., count characters in a string using `int[26]`).
   - Used in **anagrams, duplicates, frequency-based problems**.

7. **Dynamic Programming (DP)**
   - Arrays store computed states to avoid recomputation.
   - Examples:
     - Fibonacci sequence.
     - Longest Increasing Subsequence (LIS).
     - Knapsack problem.

8. **Matrix Problems (2D Arrays)**
   - Pathfinding algorithms (DFS, BFS, DP in grids).
   - Image processing and graph representations.
   - Problems like **maximum rectangle**, **spiral traversal**, **islands counting**.

9. **Subarray & Subsequence Problems**
   - Kadane’s Algorithm (Maximum Subarray Sum).
   - Longest Subarray with given sum.
   - Longest Consecutive Sequence.

10. **Stacks, Queues, Heaps Implementation**
    - Arrays often serve as the underlying structure:
      - Stack (`push/pop`).
      - Queue (circular arrays).
      - Heap (binary heap stored in an array).

---

## ✅ Summary
Arrays are essential in DSA because they:
- Provide **fast indexing**.
- Are **cache-friendly**.
- Act as the **building block** for advanced data structures (stacks, queues, heaps, hash tables).

