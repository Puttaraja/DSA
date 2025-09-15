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
