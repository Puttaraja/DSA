# 🌋 Heap in Data Structures

## 📖 Definition

A **Heap** is a special type of **Complete Binary Tree** that follows the **Heap Property**.

A Heap is generally implemented using an **array representation** instead of explicit tree nodes.

---

## 🌲 Heap Property

### Min Heap

The value of the parent node is always **smaller than or equal to** its children.

Example:

```text
        2
      /   \
     5     8
    / \
   10  15
```

---

### Max Heap

The value of the parent node is always **greater than or equal to** its children.

Example:

```text
        20
      /    \
     15     10
    /  \
   5    8
```

---

## ✨ Features of Heap

* Complete Binary Tree structure.
* Efficient retrieval of minimum or maximum element.
* Usually implemented using arrays.
* Supports dynamic insertion and deletion.
* Used internally in Priority Queues.
* Efficient for scheduling and ordering problems.

---

## 🌲 Important Terminologies

* **Root Node** → Topmost element in the heap.
* **Leaf Node** → Node with no children.
* **Parent Node** → Node connected above child nodes.
* **Child Node** → Node connected below a parent node.
* **Complete Binary Tree** → All levels are fully filled except possibly the last level, which is filled left to right.
* **Heapify** → Process of maintaining heap property.

---

## 📦 Array Representation of Heap

Since Heap is a Complete Binary Tree, it can be stored efficiently in an array.

For a node at index `i`:

Parent Index:

```
(i - 1) / 2
```

Left Child Index:

```
2 * i + 1
```

Right Child Index:

```
2 * i + 2
```

---

## ⚠️ Limitations of Heap

* Searching for arbitrary elements is slow (`O(N)`).
* Not suitable for ordered traversal like BST.
* Complex insertion/deletion logic compared to arrays.
* Heap only guarantees min/max ordering, not full sorting.

---

## ⏱️ Time Complexities

| Operation      | Time Complexity |
| -------------- | --------------- |
| Insert         | `O(log N)`      |
| Delete Root    | `O(log N)`      |
| Peek (Min/Max) | `O(1)`          |
| Heapify        | `O(log N)`      |
| Build Heap     | `O(N)`          |
| Search Element | `O(N)`          |

---

## 📊 Summary / Comparison Table

| Feature             | Min Heap           | Max Heap            |
| ------------------- | ------------------ | ------------------- |
| Root Element        | Smallest element   | Largest element     |
| Heap Property       | Parent <= Children | Parent >= Children  |
| Main Usage          | Minimum retrieval  | Maximum retrieval   |
| Priority Queue Type | Ascending priority | Descending priority |

---

## 🚀 Standard Heap Operations

### 1. Insert

Insert element at the end and move upward until heap property is maintained.

### 2. Delete Root

Remove root element, replace with last element, and heapify downward.

### 3. Heapify

Adjust tree to maintain heap property.

### 4. Peek

Get root element without removing it.

---

## 🚀 Standard DSA Problems

### Basic Heap Problems

1. Implement Min Heap.
2. Implement Max Heap.
3. Insert element into Heap.
4. Delete root element.
5. Heapify an array.
6. Convert array into Heap.

### Intermediate Problems

1. Heap Sort.
2. Kth Largest Element.
3. Kth Smallest Element.
4. Merge K Sorted Arrays.
5. Top K Frequent Elements.
6. Median from Data Stream.

---

## 🔄 Heap vs Binary Tree vs BST

| Feature           | Binary Tree | Heap     | BST       |
| ----------------- | ----------- | -------- | --------- |
| Structure Ordered | ❌           | Partial  | ✅         |
| Complete Tree     | ❌           | ✅        | ❌         |
| Fast Min/Max      | ❌           | ✅        | Partial   |
| Fast Search       | ❌           | ❌        | ✅         |
| Main Use          | Traversals  | Priority | Searching |

---

## ✅ Summary

* Heap is a Complete Binary Tree with Heap Property.
* Min Heap stores smallest element at root.
* Max Heap stores largest element at root.
* Heap is generally implemented using arrays.
* Insert and delete operations take `O(log N)`.
* Heap is the foundation for Priority Queues and Heap Sort.
* BST provides better searching, while Heap provides efficient min/max retrieval.
