# 📘 Hashing in Java – Cheat Sheet

## 🔑 What is Hashing?
- **Definition:**  
  Hashing is a technique to map data of arbitrary size to fixed-size values (called *hash values* or *hash codes*) using a hash function.  
  It allows **constant time (O(1)) average case** lookups, insertions, and deletions.  
- **Key Idea:**  
  Data is stored in **buckets** (array indices) determined by the hash function.

---

## 1️⃣ HashMap

### 📌 Definition
- `HashMap<K, V>` stores **key-value pairs**.  
- Keys must be unique, values can be duplicate.  
- Backed by a **hash table**.

### 🌟 Features
- Allows **1 null key** and multiple null values.  
- **Unordered**: No guarantee of iteration order.  
- **Fast lookup**: Average O(1) for `put`, `get`, `remove`.  
- **Not thread-safe**.  

### ⏱️ Time Complexity
| Operation | Average | Worst Case |
|-----------|----------|-------------|
| Insertion (`put`) | O(1) | O(n) |
| Search (`get`)    | O(1) | O(n) |
| Deletion (`remove`)| O(1) | O(n) |

### ⚠️ Limitations
- No order maintained.  
- Collisions can degrade performance.  
- Not suitable for concurrent environments without synchronization.  

### 🧩 Standard DSA Problems
- **Two Sum Problem** (find pairs with given sum).  
- **Frequency count of elements**.  
- **Longest consecutive subsequence**.  
- **Check for duplicates in array**.  

---

## 2️⃣ LinkedHashMap

### 📌 Definition
- `LinkedHashMap<K, V>` is similar to `HashMap` but **maintains insertion order** of elements using a **doubly-linked list**.  

### 🌟 Features
- Maintains predictable **iteration order** (insertion or access order).  
- Allows **1 null key** and multiple null values.  
- Slightly slower than `HashMap` due to extra linked list maintenance.  

### ⏱️ Time Complexity
| Operation | Average | Worst Case |
|-----------|----------|-------------|
| Insertion | O(1) | O(n) |
| Search    | O(1) | O(n) |
| Deletion  | O(1) | O(n) |

### ⚠️ Limitations
- Extra memory for linked list pointers.  
- Slightly slower than `HashMap`.  

### 🧩 Standard DSA Problems
- **LRU Cache implementation**.  
- **Order-preserving frequency counting**.  
- **Design data structures requiring insertion/access order tracking**.  

---

## 3️⃣ HashSet

### 📌 Definition
- `HashSet<E>` stores **unique elements only** (no duplicates).  
- Backed by `HashMap` internally (elements stored as keys).  

### 🌟 Features
- **No duplicates allowed**.  
- Allows **1 null element**.  
- **Unordered**: No guarantee of iteration order.  
- Very fast average O(1) operations.  

### ⏱️ Time Complexity
| Operation | Average | Worst Case |
|-----------|----------|-------------|
| Insertion (`add`) | O(1) | O(n) |
| Search (`contains`)| O(1) | O(n) |
| Deletion (`remove`)| O(1) | O(n) |

### ⚠️ Limitations
- No ordering.  
- Cannot access elements by index.  
- Performance depends on good hash function.  

### 🧩 Standard DSA Problems
- **Check for duplicates in array**.  
- **Union and Intersection of sets**.  
- **Longest consecutive subsequence**.  
- **Remove duplicates from a string/array**.  

---

## 4️⃣ LinkedHashSet

### 📌 Definition
- `LinkedHashSet<E>` is a **HashSet** with predictable iteration order, maintained by a **doubly-linked list** across entries.  

### 🌟 Features
- Maintains **insertion order**.  
- Allows **1 null element**.  
- Slower than `HashSet` due to order maintenance.  

### ⏱️ Time Complexity
| Operation | Average | Worst Case |
|-----------|----------|-------------|
| Insertion | O(1) | O(n) |
| Search    | O(1) | O(n) |
| Deletion  | O(1) | O(n) |

### ⚠️ Limitations
- Slightly slower than `HashSet`.  
- Extra memory overhead for linked list.  

### 🧩 Standard DSA Problems
- **Remove duplicates while preserving order**.  
- **Implement ordered sets**.  
- **Track visited nodes in BFS/DFS with order**.  
- **Cache mechanisms where uniqueness + order matters**.  

---
